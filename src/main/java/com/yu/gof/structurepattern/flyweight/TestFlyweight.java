package com.yu.gof.structurepattern.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		xiaomingDrow();
		
		xiaozhiDrow();
	}

	private static void xiaomingDrow() {
		IColourPen greenPen = ColourPenFactory.getColourPen("绿色");
		greenPen.draw("草");

		IColourPen bluePen = ColourPenFactory.getColourPen("蓝色");
		bluePen.draw("蓝天");
	}
	
	private static void xiaozhiDrow() {
		IColourPen greenPen = ColourPenFactory.getColourPen("绿色");
		greenPen.draw("树叶");

		IColourPen grayPen = ColourPenFactory.getColourPen("灰色");
		grayPen.draw("路");
	}
	
	
	//增加笔袋，作为容器来装彩笔，从笔袋中取笔，就不会创建重复的笔

}
