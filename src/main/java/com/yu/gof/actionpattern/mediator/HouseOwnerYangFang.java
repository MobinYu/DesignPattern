package com.yu.gof.actionpattern.mediator;

public class HouseOwnerYangFang implements HouseOwner {

	@Override
	public void supply() {
		System.out.println("小区房东提供一套洋房！");
	}

}
