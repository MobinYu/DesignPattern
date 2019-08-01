package com.yu.gof.structurepattern.bridge;

public class PhoneIos extends Phone {

	public PhoneIos(Software software){
		this.setSystem("IOS");
		this.setSoftware(software);
	}
	
	@Override
	public void openSoftware() {
		this.getSoftware().open(this);
	}
}
