package com.yu.gof.structurepattern.composite;

public abstract class Employee {

	private String name;
	
	public abstract void display(int index);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
