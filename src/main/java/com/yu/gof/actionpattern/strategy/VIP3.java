package com.yu.gof.actionpattern.strategy;

public class VIP3 implements IDiscountStrategy {

	@Override
	public void discount() {
		System.out.println("vip3级：打8.8折");
	}
}
