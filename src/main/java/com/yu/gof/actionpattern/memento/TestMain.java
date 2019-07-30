package com.yu.gof.actionpattern.memento;

public class TestMain {

	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("State #1");
		originator.setState("State #2");
		careTaker.addMemento(originator.saveStateToMemento());
		originator.setState("State #3");
		careTaker.addMemento(originator.saveStateToMemento());
		originator.setState("State #4");
		
		System.out.println("Current State: " + originator.getState());
		originator.getStateFromMemento(careTaker.getMemento(0));
		System.out.println("First saved State: " + originator.getState());
		originator.getStateFromMemento(careTaker.getMemento(1));
		System.out.println("Second saved State: " + originator.getState());
	}

}
