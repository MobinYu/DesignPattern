package com.yu.gof.actionpattern.state.other;

public class TestMain {
	
	public static void main(String[] args) {
		User user = new User();
		user.setState(new Vip3());
		user.pay(50);
	}

}
