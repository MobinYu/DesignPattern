package com.yu.gof.createpattern.abstractfactory;

public class BenzCarFactory implements CarFactory {

	@Override
	public void priduceCar() {
		System.out.println("生产奔驰车");
	}
	
	@Override
	public void installTire() {
		TireFactory tire = new BenzTireFactory();
		tire.produceTire();
		
		System.out.println("为奔驰车安装轮胎");
	}

	@Override
	public void installSteeringWheel() {
		SteeringWheelFactory steeringWheel = new BenzSteeringWheelFactory();
		steeringWheel.produceSteeringWheel();
		System.out.println("为奔驰车安装方向盘");
	}


}
