package com.yu.gof.createpattern.builder;

public class BanliPaiguSoup implements Soup {

	@Override
	public void addMeat() {
		System.out.println("加排骨");
	}

	@Override
	public void addGarnish() {
		System.out.println("加板栗");
	}

	@Override
	public void waitMinute(int minute) {
		System.out.println("熬制" + minute + "分钟");
	}

}
