package com.yu.gof.createpattern.builder;

public class Director {

	DongguaPaiguBuilder dongguaPaiguBuilder = new DongguaPaiguBuilder();
	BanliPaiguBuilder banliPaiguBuilder = new BanliPaiguBuilder();
	
	public DongguaPaiguSoup buildDongguaPaiGuSoup() {
		dongguaPaiguBuilder.buildSoup(); //制作
		return (DongguaPaiguSoup) dongguaPaiguBuilder.getSoup();
	}
	
	public BanliPaiguSoup buildBanliPaiGuSoup() {
		banliPaiguBuilder.buildSoup(); //制作
		return (BanliPaiguSoup) banliPaiguBuilder.getSoup();
	}
}
