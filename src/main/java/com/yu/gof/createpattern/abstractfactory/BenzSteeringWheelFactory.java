package com.yu.gof.createpattern.abstractfactory;

public class BenzSteeringWheelFactory implements SteeringWheelFactory{

	@Override
	public void produceSteeringWheel() {
		System.out.println("生产奔驰方向盘");
	}
}
