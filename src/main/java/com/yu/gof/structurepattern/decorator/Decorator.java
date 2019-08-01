package com.yu.gof.structurepattern.decorator;

public abstract class Decorator extends Tea {

	private Tea tea;

	public Decorator(Tea tea) {
		this.tea = tea;
	}
	
	@Override
	public void process() {
		this.tea.process();
	}
}
