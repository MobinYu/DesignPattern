package com.yu.gof.structurepattern.flyweight;

public class ColourPen implements IColourPen {

	private String color;
	
	public ColourPen(String color) {
		System.out.println("---新建【" + color + "】彩笔");
		this.color = color;
	}

	@Override
	public void draw(String scenery) {
		System.out.println("用" + this.color + "彩笔画" + scenery);
	}

}
