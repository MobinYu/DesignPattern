package com.yu.gof.structurepattern.adapter;

/**
 * -源接口（这个接口需要重新配置以适应目标接口）
 */
public class Laptop {
	
	public void readAndWrite() {
		System.out.println("使用电脑读写数据");
	}
}
