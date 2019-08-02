package com.yu.gof.createpattern.singleton;

/**
 * -在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的
 */
public class CarSingle1 {
	
	private static class CarInstance {
		private static final CarSingle1 car = new CarSingle1();
	}
	
	private CarSingle1() {};
	
	public static CarSingle1 getInstance() {
		return CarInstance.car;
	}

	public void run() {
		System.out.println("车走。。。");
	}
}
