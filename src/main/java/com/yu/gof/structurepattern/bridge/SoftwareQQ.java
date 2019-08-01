package com.yu.gof.structurepattern.bridge;

public class SoftwareQQ implements Software {

	@Override
	public void open(Phone phone) {
		System.out.println("打开 " + phone.getSystem() + " 手机的 QQ");
	}

}
