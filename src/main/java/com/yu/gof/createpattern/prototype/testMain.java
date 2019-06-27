package com.yu.gof.createpattern.prototype;

public class testMain {

	public static void main(String[] args) {
		IDCard card = new ConIDCard("小明的身份证正面", "小明的身份证反面");
		
		//开始复印
		for (int i = 1; i <= 5; i++) {
			IDCard copy = (IDCard) card.clone();
			System.out.println("复制第"+ i + "张" + copy.getFront());
		}
	}
}
