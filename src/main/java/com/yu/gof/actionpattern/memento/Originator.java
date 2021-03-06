package com.yu.gof.actionpattern.memento;

/**
 * -要恢复对象
 */
public class Originator {

	private String state;
	
	public Memento saveStateToMemento() {
		return new Memento(state);
	}
	
	public void getStateFromMemento(Memento memento) {
		this.state = memento.getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
