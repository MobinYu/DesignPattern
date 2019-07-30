package com.yu.gof.actionpattern.observer;

public class TestMain {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new ObserverOne(subject);
		new ObserverTwo(subject);
		new ObserverThree(subject);
		
		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);

	}

}
