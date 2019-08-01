package com.yu.gof.structurepattern.facade;

public class Leader {

	private Developer developer = new Developer();
	private Tester tester = new Tester();
	
	public void processDemand(String name) {
		developer.develop(name);
		tester.test(name);
	}
}
