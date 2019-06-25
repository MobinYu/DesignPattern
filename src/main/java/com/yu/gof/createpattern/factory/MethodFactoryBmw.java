package com.yu.gof.createpattern.factory;

public class MethodFactoryBmw implements MethodFactory {

	@Override
	public Car getProduceCar() {
		return new BmwCar();
	}

}
