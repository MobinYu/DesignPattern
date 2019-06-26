package com.yu.gof.createpattern.builder;

public class TestMain {

	public static void main(String[] args) {
		Director director = new Director();
		
		director.buildDongguaPaiGuSoup();
		
		director.buildBanliPaiGuSoup();
	}
}
