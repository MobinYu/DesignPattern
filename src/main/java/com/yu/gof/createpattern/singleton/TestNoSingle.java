package com.yu.gof.createpattern.singleton;

public class TestNoSingle {

	public static void main(String[] args) {
		Driver xiaoMing = new Driver();
		Car car1 = xiaoMing.goToSchool();
		Car car2 = xiaoMing.shopping();
		
		System.out.println("car1 = car2 ? --> " + ( car1 == car2));
	}
}
