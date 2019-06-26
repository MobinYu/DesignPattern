package com.yu.gof.createpattern.builder;

public class DongguaPaiguBuilder implements Builder{

	DongguaPaiguSoup dongguaPaiGuSoup = new DongguaPaiguSoup();
	
	@Override
	public void buildSoup() {
		System.out.println("--------制作冬瓜排骨汤--------");
		dongguaPaiGuSoup.addMeat();
		dongguaPaiGuSoup.waitMinute(30);
		dongguaPaiGuSoup.addGarnish();
		dongguaPaiGuSoup.waitMinute(10);
	}

	@Override
	public Soup getSoup() {
		return dongguaPaiGuSoup;
	}

}
