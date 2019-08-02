package com.yu.gof.createpattern.singleton;

public class Driver2 {
	
	public CarSingle1 shopping() {
		System.out.println("小明去购物");
		CarSingle1 car = CarSingle1.getInstance();
		car.run();
		
		return car;
	}
	
	public CarSingle1 goToSchool() {
		System.out.println("小明去学校");
		CarSingle1 car = CarSingle1.getInstance();
		car.run();
		
		return car;
	}

}
