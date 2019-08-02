package com.yu.gof.createpattern.singleton;

/**
 * -静态内部类的方式是线程安全的
 */
public class CarSingle2 {
	
	private static class CarInstance {
		private static final CarSingle2 car = new CarSingle2();
	}
	
	private CarSingle2() {};
	
	public static CarSingle2 getInstance() {
		return CarInstance.car;
	}

	public void run() {
		System.out.println("车走。。。");
	}
}
