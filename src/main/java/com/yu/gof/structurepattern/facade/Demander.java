package com.yu.gof.structurepattern.facade;

public class Demander {

	private Developer developer = new Developer();
	private Tester tester = new Tester();
	
	public void demand(String name) {
		System.out.println("提出需求： " + name);
		developer.develop(name);
		tester.test(name);
	}
}
