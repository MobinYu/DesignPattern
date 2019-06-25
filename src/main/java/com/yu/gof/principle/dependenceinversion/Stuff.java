package com.yu.gof.principle.dependenceinversion;

abstract class Stuff {
	
	private String name;
	
	abstract void service();
	
	abstract void askHelp(Boss boss);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
