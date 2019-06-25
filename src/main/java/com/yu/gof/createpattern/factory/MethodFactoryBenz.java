package com.yu.gof.createpattern.factory;

public class MethodFactoryBenz implements MethodFactory {

	@Override
	public Car getProduceCar() {
		return new BenzCar();
	}

}
