package com.yu.gof.structurepattern.decorator;

public class CommonTea extends Tea {

	@Override
	public void process() {
		System.out.println("泡一杯普通龙井茶");
	}

}
