package com.yu.gof.createpattern.factory;

public class BenzCar implements Car {

	@Override
	public void createCar() {
		System.out.println("制造奔驰汽车");
	}

}
