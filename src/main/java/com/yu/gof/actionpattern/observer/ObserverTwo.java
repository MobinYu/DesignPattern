package com.yu.gof.actionpattern.observer;

public class ObserverTwo extends Observer {
	
	public ObserverTwo(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Observer two: " + Integer.toOctalString( subject.getState() ));
	}
}
