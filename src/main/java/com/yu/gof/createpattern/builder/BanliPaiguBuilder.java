package com.yu.gof.createpattern.builder;

public class BanliPaiguBuilder implements Builder {

	BanliPaiguSoup banliPaiguSoup = new BanliPaiguSoup();
	
	@Override
	public void buildSoup() {
		System.out.println("--------制作板栗排骨汤--------");
		banliPaiguSoup.addMeat();
		banliPaiguSoup.addGarnish();
		banliPaiguSoup.waitMinute(40);
	}

	@Override
	public Soup getSoup() {
		return banliPaiguSoup;
	}

}
