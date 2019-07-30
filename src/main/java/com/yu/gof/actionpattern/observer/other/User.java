package com.yu.gof.actionpattern.observer.other;

import java.util.LinkedList;
import java.util.List;

/**
 * -朋友圈圈子用户（观察者，被观察者）
 */
public class User implements Observer, Observable {

	private String name;
	private List<Observer> friends;
	
	public User(String name) {
		this.name = name;
		this.friends = new LinkedList<>();
	}

	@Override
	public void addObserver(Observer observer) {
		this.friends.add(observer);
	}

	@Override
	public void removerObserver(Observer observer) {
		this.friends.remove(observer);
	}

	@Override
	public void notifyObserver(String message) {
		for (Observer observer : friends) {
			observer.update(this.name, message);
		}
	}

	@Override
	public void update(String name, String message) {
		//观察到变化后要做的事
		System.out.println("【" + this.name + "】看到【" + name + "】发的朋友圈：" + message);
	}
	
	/**
	 * -被观察者行为方法（发朋友圈状态）
	 * @param message
	 */
	public void sendMessage(String message) {
		System.out.println("-->【" + this.name + "】发布发的朋友圈动态：" + message);
		//通知观察者
		this.notifyObserver(message);
	}

}
