package com.yu.gof.structurepattern.adapter;

public class TestMain {
	
	public static void main(String[] args) {
		ReadWriteAdaper readWriteAdaper = new ReadWriteAdaper(new Laptop());
		readWriteAdaper.readAndWriteMicroSDCard();
	}

}
