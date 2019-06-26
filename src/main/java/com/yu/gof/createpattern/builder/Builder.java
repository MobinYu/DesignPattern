package com.yu.gof.createpattern.builder;

/**
 * -抽象建造者（builder）：描述具体建造者的公共接口，一般用来定义建造细节的方法，并不涉及具体的对象部件的创建
 * 
 */
public interface Builder {
	
	//制作过程（隐藏细节）
	public void buildSoup();

	//得到产品
	public Soup getSoup();
}
