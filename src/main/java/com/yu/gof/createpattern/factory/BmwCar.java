package com.yu.gof.createpattern.factory;

public class BmwCar implements Car {

	@Override
	public void createCar() {
		System.out.println("制造宝马汽车");
	}

}
