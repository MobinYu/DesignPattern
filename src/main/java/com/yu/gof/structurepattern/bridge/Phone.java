package com.yu.gof.structurepattern.bridge;

abstract class Phone {

	private String system;
	private Software software;

	public abstract void openSoftware();

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public Software getSoftware() {
		return software;
	}

	public void setSoftware(Software software) {
		this.software = software;
	}
	
}
