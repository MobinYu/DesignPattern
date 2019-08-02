package com.yu.gof.createpattern.singleton;

public class Driver {
	
	public Car shopping() {
		System.out.println("小明去购物");
		Car car = new Car();
		car.run();
		
		return car;
	}
	
	public Car goToSchool() {
		System.out.println("小明去学校");
		Car car = new Car();
		car.run();
		return car;
	}

}
