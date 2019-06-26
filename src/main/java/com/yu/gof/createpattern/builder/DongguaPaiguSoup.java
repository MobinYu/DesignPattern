package com.yu.gof.createpattern.builder;

public class DongguaPaiguSoup implements Soup {

	@Override
	public void addMeat() {
		System.out.println("加排骨");
	}

	@Override
	public void addGarnish() {
		System.out.println("加冬瓜");
	}

	@Override
	public void waitMinute(int minute) {
		System.out.println("熬制" + minute + "分钟");
	}

}
