package com.yu.gof.actionpattern.observer;

public class ObserverOne extends Observer {
	
	public ObserverOne(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Observer one: " + Integer.toBinaryString( subject.getState() ));
	}

}
