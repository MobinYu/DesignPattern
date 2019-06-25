package com.yu.gof.actionpattern.command;

public class Requirement {
	
	private String name;

	public Requirement(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
