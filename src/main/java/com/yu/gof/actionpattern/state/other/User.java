package com.yu.gof.actionpattern.state.other;

public class User {
	
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void pay(double money) {
		this.state.doPayment(money);
	}

}
