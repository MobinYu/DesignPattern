package com.yu.study.designpattern.p2.f1;

public class TestFactory {

	public static void main(String[] args) {
		
		ICar car = CarFactory.produceCar("bugatti");
		
		car.getCar();
	}
}
