package com.yu.gof.createpattern.abstractfactory;

public class BmwCarFactory implements CarFactory {

	@Override
	public void produceTire() {
		// TODO Auto-generated method stub
		System.out.println("生产宝马轮胎");
	}

	@Override
	public void produceSteeringWheel() {
		// TODO Auto-generated method stub
		System.out.println("生产宝马方向盘");
	}

}
