package com.yu.gof.actionpattern.state.other;

public class Vip3 implements State {

	@Override
	public void doPayment(double originalPrice) {
		System.out.println("原价：" + originalPrice + "，vip3会员价格：" + originalPrice * 0.85);
	}

}
