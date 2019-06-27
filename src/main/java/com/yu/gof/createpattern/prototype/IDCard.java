package com.yu.gof.createpattern.prototype;

abstract class IDCard implements Cloneable {

	private String front; //正面
	private String back; //反面
	
	public IDCard(String front, String back) {
		this.front = front;
		this.back = back;
	}
	
	public String getFront() {
		return front;
	}
	public void setFront(String front) {
		this.front = front;
	}
	public String getBack() {
		return back;
	}
	public void setBack(String back) {
		this.back = back;
	}
	
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
