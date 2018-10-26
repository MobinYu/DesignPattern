package com.yu.gof.p1;

public class Singleton3 {

	//持有私有静态实例，防止被引用，此处直接创建对象，目的是实现勤加载
	private static Singleton3 instance = new Singleton3();
	
	//私有构造方法，防止被实例化
	private Singleton3() {
		
	}

	//静态工程方法，创建实例
	public static Singleton3 getInstance(){
		return instance;
	}
	
	//如果该对象被用于序列化，可以保证对象在序列化前后保持一致
	public Object readResolve() {
		return instance;
	}
}
