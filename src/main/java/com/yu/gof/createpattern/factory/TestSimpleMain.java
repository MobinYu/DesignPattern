package com.yu.gof.createpattern.factory;

/** 简单工厂模式测试 */
public class TestSimpleMain {

	public static void main(String[] args) {
		SimpleFactory sf = new SimpleFactory();
		sf.produce("Benz");
		
		sf.produce("Bmw");
	}
}
