package com.yu.gof.actionpattern.mediator;

public class HouseOwnerPingFang implements HouseOwner {

	@Override
	public void supply() {
		System.out.println("村庄房东提供一套平房！");
	}

}
