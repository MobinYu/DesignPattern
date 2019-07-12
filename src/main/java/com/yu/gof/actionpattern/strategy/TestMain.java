package com.yu.gof.actionpattern.strategy;

public class TestMain {
	
	public static void main(String[] args) {
		Context context;
		
		//vip1
		context = new Context(new VIP1());
		context.operate();
		
		//vip2
		context = new Context(new VIP2());
		context.operate();
		
		//vip3
		context = new Context(new VIP3());
		context.operate();
	}

}
