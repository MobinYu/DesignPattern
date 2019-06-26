package com.yu.gof.createpattern.abstractfactory;

public class BmwCarFactory implements CarFactory {

	@Override
	public void priduceCar() {
		System.out.println("生产宝马车");
	}
	
	@Override
	public void installTire() {
		System.out.println("安装宝马轮胎");
	}

	@Override
	public void installSteeringWheel() {
		System.out.println("安装宝马方向盘");
	}

}
