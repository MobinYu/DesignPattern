package com.yu.gof.actionpattern.observer;

public class ObserverThree extends Observer {
	
	public ObserverThree(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Observer three: " + Integer.toHexString( subject.getState() ));
	}
}
