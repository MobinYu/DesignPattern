package com.yu.gof.actionpattern.strategy;

public class VIP2 implements IDiscountStrategy {

	@Override
	public void discount() {
		System.out.println("vip2级：打9.0折");
	}

}
