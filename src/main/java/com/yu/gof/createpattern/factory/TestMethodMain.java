package com.yu.gof.createpattern.factory;

/** 工厂方法模式测试 */
public class TestMethodMain {

	public static void main(String[] args) {
		MethodFactory benzmf = new MethodFactoryBenz();
		benzmf.getProduceCar().createCar();
		
		MethodFactory bmwmf = new MethodFactoryBmw();
		bmwmf.getProduceCar().createCar();
	}
}
