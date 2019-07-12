package com.yu.gof.actionpattern.strategy;

public class VIP1 implements IDiscountStrategy {

	@Override
	public void discount() {
		System.out.println("vip1级：打9.5折");
	}

}
