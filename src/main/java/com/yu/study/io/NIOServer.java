package com.yu.study.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * NIO同步非阻塞IO
 * 
 * 1、Selector: 选择注册到selector的ServerSocketChannel，通过selector.selectedKeys()得到得到就绪Channel的key集合
 * 2、Channel: 通过selectedKeys得到key的事件，按事件类型处理对应的逻辑
 * 3、Buffer: 将SocketChannel中的数据都出来
 * 	3.1：allocate(int)创建不同类型的Buffer
 * 	3.2：put方法往Buffer中写数据，flip方法将Buffer转为读模式，clear\compact方法清除和整理Buffer（转为写模式）
 * 	3.3：Buffer三个重要属性，capacity、position、limit
 * 
 * @author Super Yu
 *
 */
public class NIOServer {
	private static Charset charset = Charset.forName("UTF-8");
	private static CharsetDecoder decoder = charset.newDecoder();
	
	private static int SERVER_PORT = 9011;
	
	public static void main(String[] args) throws IOException {
		//1、创建一个Selector
		Selector selector = Selector.open();
		
		ServerSocketChannel ssc = ServerSocketChannel.open();
		ssc.bind(new InetSocketAddress(SERVER_PORT));
		
		ssc.configureBlocking(false); //非阻塞
		
		//2、将要交给Selector检测的SelectableChannel注册进来，监听"连接事件" 
		ssc.register(selector, SelectionKey.OP_ACCEPT);
		
		//连接计数
		int connectionCount = 0;
		//极少量线程
		int threads = 3;
		
		//创建线程池
		ExecutorService tpool = Executors.newFixedThreadPool(threads);
		
		while (true) {
			//3、通过Selector来选择就绪的Channel
			int readyChannelCount = selector.select(); //阻塞直到有就绪的Channel
			
			if (readyChannelCount == 0) { //就绪的Channel数量
				continue;
			}
			
			//3、得到就绪SelectionKey的集合
			Set<SelectionKey> selectionKeys = selector.selectedKeys();
			
			Iterator<SelectionKey> keyIterators = selectionKeys.iterator();
			
			//******处理就绪集合********
			while (keyIterators.hasNext()) {
				SelectionKey key = keyIterators.next();
				
				if (key.isAcceptable()) {
					//a connection was accepted by a ServerSocketChannel.
					//4、得到就绪通道
					ServerSocketChannel ssChannle = (ServerSocketChannel) key.channel();
					//接受连接
					SocketChannel cc = ssChannle.accept();
					
					//设置非阻塞
					cc.configureBlocking(false);
					//5、向selector注册，监听"读就绪事件"，数据到来没有
					cc.register(selector, SelectionKey.OP_READ, ++connectionCount);
					
				} else if (key.isConnectable()) {
					//a connection was established with a remot server.
				} else if (key.isReadable()) {
					//a channel is ready for reading.
					//交给线程池去处理数据读
					tpool.execute(new SocketProcess(key));
					
					//取消Selector注册，防止线程池处理不及时，重复选择
					key.cancel();
					
				} else if (key.isWritable()) {
					//a channel is ready for writing.
				}
				
				//处理了，一定要从selectionKey中移除
				keyIterators.remove();
			}
		}
	}
	
	static class SocketProcess implements Runnable {

		SelectionKey key;
		
		public SocketProcess(SelectionKey key) {
			super();
			this.key = key;
		}

		@Override
		public void run() {
			try {
				
				String mess = readFromChannel();
				
				//attachment就是channel注册时附加的信息
				System.out.println("连接 " + key.attachment() + " 发来了：" + mess);
				
				//如果连接不需要了，就关闭
				key.channel().close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private String readFromChannel() throws IOException{
			SocketChannel sc = (SocketChannel) key.channel();
			
			int bfsize = 1024;
			ByteBuffer rbf = ByteBuffer.allocateDirect(bfsize); //直接分配内存（从系统直接分配，allocate从堆中分配）
			
			//定义一个更大的buffer
			ByteBuffer bigBf = null;
			
			//读的次数计数
			int count = 0;
			while (sc.read(rbf) != -1) { //sc.read(rbf)读到的字节数
				count ++;
				
				ByteBuffer temp = ByteBuffer.allocateDirect(bfsize * (count + 1));
				
				if (null != bigBf) {
					//将buffer又写转为读模式
					bigBf.flip();
					temp.put(bigBf);
				}
				
				bigBf = temp;
				
				//将这次读到的数据放入大buffer
				rbf.flip();
				bigBf.put(rbf);
				//为下次读，清理buffer
				rbf.clear();
			}
			
			if (bigBf != null) {
				bigBf.flip();
				try {
					//将字节转为字符，返回接收到的字符串
					return decoder.decode(bigBf).toString();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return null;
		}
	}

}
