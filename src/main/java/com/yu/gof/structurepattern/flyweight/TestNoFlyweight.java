package com.yu.gof.structurepattern.flyweight;

public class TestNoFlyweight {

	public static void main(String[] args) {
		xiaomingDrow();
		
		xiaozhiDrow();
	}

	private static void xiaomingDrow() {
		IColourPen greenPen = new ColourPen("绿色");
		greenPen.draw("草");

		IColourPen bluePen = new ColourPen("蓝色");
		bluePen.draw("蓝天");
	}
	
	private static void xiaozhiDrow() {
		IColourPen greenPen = new ColourPen("绿色");
		greenPen.draw("树叶");

		IColourPen grayPen = new ColourPen("灰色");
		grayPen.draw("路");
	}
	
	//小明和小智画画用的绿色彩笔，并不是同一个彩笔。在软件开发中，就是两个对象，可以共用的我们尽量共用，节省一些内存空间。
	
	//增加笔袋，作为容器来装彩笔

}
