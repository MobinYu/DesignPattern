package com.yu.gof.structurepattern.bridge;

public class SoftwareWeChat implements Software {

	@Override
	public void open(Phone phone) {
		System.out.println("打开 " + phone.getSystem() + " 手机的微信");
	}

}
