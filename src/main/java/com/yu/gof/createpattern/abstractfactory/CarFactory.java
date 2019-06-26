package com.yu.gof.createpattern.abstractfactory;

/**
 * -抽象汽车工厂
 */
public interface CarFactory {

	public void priduceCar();
	
	public void installTire();
	
	public void installSteeringWheel();
}
