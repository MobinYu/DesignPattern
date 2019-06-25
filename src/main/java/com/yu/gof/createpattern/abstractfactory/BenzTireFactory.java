package com.yu.gof.createpattern.abstractfactory;

public class BenzTireFactory implements TireFactory {

	@Override
	public void produceTire() {
		System.out.println("生产奔驰轮胎");
	}

}
