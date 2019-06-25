package com.yu.gof.createpattern.abstractfactory;

public class BenzCarFactory implements CarFactory {

	@Override
	public void produceTire() {
		TireFactory tire = new BenzTireFactory();
		tire.produceTire();
		
	}

	@Override
	public void produceSteeringWheel() {
		// TODO Auto-generated method stub
		
	}

}
