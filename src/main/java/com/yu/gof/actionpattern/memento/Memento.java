package com.yu.gof.actionpattern.memento;

/**
 * -备忘录
 * -保存要恢复对象（Originator）的状态
 */
public class Memento {

	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
	
}
