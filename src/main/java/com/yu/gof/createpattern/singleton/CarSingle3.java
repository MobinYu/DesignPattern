package com.yu.gof.createpattern.singleton;

/**
 * -同步双重检查
 */
public class CarSingle3 {
	
	private static CarSingle3 car = null;
	
	private CarSingle3() {};
	
	public static CarSingle3 getInstance() {
		if (null == car) {
			synchronized (CarSingle3.class) {
				if (null == car) {
					car = new CarSingle3();
				}
			}
		}
		return car;
	}

	public void run() {
		System.out.println("车走。。。");
	}
}
