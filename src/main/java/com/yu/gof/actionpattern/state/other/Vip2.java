package com.yu.gof.actionpattern.state.other;

public class Vip2 implements State {

	@Override
	public void doPayment(double originalPrice) {
		System.out.println("原价：" + originalPrice + "，vip2会员价格：" + originalPrice * 0.90);
	}

}
