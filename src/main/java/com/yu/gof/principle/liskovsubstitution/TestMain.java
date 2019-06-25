package com.yu.gof.principle.liskovsubstitution;

public class TestMain {
	
	public static void main(String[] args) {
		Father f = new Father();
		f.potatoBeef();
		
		Son1 s1 = new Son1();
		s1.potatoBeef(); //此处替换成子类，功能已改变，不满足替换原则
		
		
		Son2 s2 = new Son2();
		s2.potatoBeef(); //此处替换成子类，功能未改变，满足替换原则
	}

}
