package com.yu.gof.structurepattern.bridge;

public class TestMain {
	
	public static void main(String[] args) {
		SoftwareQQ qq = new SoftwareQQ();
		SoftwareWeChat weChat = new SoftwareWeChat();
		
		Phone phoneAndroid = new PhoneAndroid(qq);
		phoneAndroid.openSoftware();
		
		Phone phoneIos = new PhoneIos(weChat);
		phoneIos.openSoftware();
	}

}
