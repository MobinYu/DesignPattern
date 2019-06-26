package com.yu.gof.createpattern.builder;

public interface Soup {

	//加肉
	public void addMeat();
	//加配菜
	public void addGarnish();
	//熬制时间
	public void waitMinute(int minute);
}
