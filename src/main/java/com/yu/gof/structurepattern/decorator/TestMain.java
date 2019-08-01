package com.yu.gof.structurepattern.decorator;

public class TestMain {

	public static void main(String[] args) {
		CommonTea commonTea = new CommonTea();
		
		SugarTea sugarTea = new SugarTea(commonTea);
		sugarTea.process();
		
		HoneyTea honeyTea = new HoneyTea(commonTea);
		honeyTea.process();
	}
}
