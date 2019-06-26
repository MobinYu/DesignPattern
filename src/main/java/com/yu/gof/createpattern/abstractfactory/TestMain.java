package com.yu.gof.createpattern.abstractfactory;

public class TestMain {

	public static void main(String[] args) {
		CarFactory benzcf = new BenzCarFactory();
		benzcf.priduceCar();
		benzcf.installTire();
		benzcf.installSteeringWheel();
		
		//部分未实现
		CarFactory bmwcf = new BmwCarFactory();
		bmwcf.priduceCar();
		bmwcf.installTire();
		bmwcf.installSteeringWheel();
	}
}
