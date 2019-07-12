package com.yu.gof.actionpattern.templatemethod;

public class TestMain {

	public static void main(String[] args) {
		HouseTemplate house = new GlassHouse();
		
		house.buildHouse();
	}
}
