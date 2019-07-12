package com.yu.gof.actionpattern.templatemethod;

public class GlassHouse extends HouseTemplate {

	@Override
	public void buildWindows() {
		System.out.println("Building Glass Windows");
	}

	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
		
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Glass Pillars");
		
	}

}
