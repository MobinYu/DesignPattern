package com.yu.gof.structurepattern.decorator;

public class HoneyTea extends Decorator {

	public HoneyTea(Tea tea) {
		super(tea);
	}
	
	@Override
	public void process() {
		super.process();
		System.out.println("加蜂蜜");
	}

}
