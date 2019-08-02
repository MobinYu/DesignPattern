package com.yu.gof.createpattern.singleton;

public class TestSingle {

	public static void main(String[] args) {
		Driver2 xiaoMing = new Driver2();
		CarSingle1 car1 = xiaoMing.goToSchool();
		CarSingle1 car2 = xiaoMing.shopping();
		
		System.out.println("car1 = car2 ? --> " + ( car1 == car2));
	}
}
