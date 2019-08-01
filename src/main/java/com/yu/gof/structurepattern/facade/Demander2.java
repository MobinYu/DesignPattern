package com.yu.gof.structurepattern.facade;

public class Demander2 {
	
	private Leader leader = new Leader();
	
	public void demand(String name) {
		System.out.println("提需求：" + name);
		leader.processDemand(name);
	}

}
