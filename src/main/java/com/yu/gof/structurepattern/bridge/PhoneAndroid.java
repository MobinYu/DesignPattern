package com.yu.gof.structurepattern.bridge;

public class PhoneAndroid extends Phone {

	public PhoneAndroid(Software software){
		this.setSystem("Android");
		this.setSoftware(software);
	}
	
	@Override
	public void openSoftware() {
		this.getSoftware().open(this);
	}

}
