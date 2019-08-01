package com.yu.gof.structurepattern.decorator;

public class SugarTea extends Decorator {

	public SugarTea(Tea tea) {
		super(tea);
	}
	
	@Override
	public void process() {
		super.process();
		System.out.println("加冰糖");
	}

}
