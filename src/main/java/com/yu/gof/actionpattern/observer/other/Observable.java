package com.yu.gof.actionpattern.observer.other;

/**
 * -被观察者接口
 */
public interface Observable {

	void addObserver(Observer observer);
	void removerObserver(Observer observer);
	void notifyObserver(String message);
}
