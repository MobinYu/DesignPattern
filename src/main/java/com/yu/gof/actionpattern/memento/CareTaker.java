package com.yu.gof.actionpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * -监管者
 * -保持和恢复版本对象（Originator）
 */
public class CareTaker {
	
	private List<Memento> mementoList = new ArrayList<Memento>();
	
	public void addMemento(Memento memento) {
		mementoList.add(memento);
	}
	
	public Memento getMemento(int index) {
		return mementoList.get(index);
	}

}
