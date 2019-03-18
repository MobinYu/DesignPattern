package com.yu.gof.p1;

/**
 * 懒汉式(线程不安全)[不可用]
 * 这种写法起到了Lazy Loading的效果，但是只能在单线程下使用。如果在多线程下，一个线程进入了if (singleton == null)判断语句块，
 * 还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式。
 * 
 * @author Super Yu
 *
 */
public class Singleton1 {
	
	//持有私有静态实例，防止被引用
	private static Singleton1 instance = null;
	
	//私有构造方法，防止被实例化
	private Singleton1() {}

	//静态工程方法，创建实例
	public static Singleton1 getInstance(){
		if (null == instance){
			instance = new Singleton1();
		}
		return instance;
	}
	
	//如果该对象被用于序列化，可以保证对象在序列化前后保持一致
	public Object readResolve() {
		return instance;
	}

}
