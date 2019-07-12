package com.yu.gof.actionpattern.templatemethod;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Wooden Pillars");
	}

	@Override
	public void buildWindows() {
		System.out.println("Building Wooden Windows");
	}

}
