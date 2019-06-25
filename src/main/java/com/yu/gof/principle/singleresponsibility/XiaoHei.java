package com.yu.gof.principle.singleresponsibility;

public class XiaoHei implements Wash, Sweep{

	@Override
	public void doWash() {
		System.out.println("洗碗。。。");
	}
	
	@Override
	public void doSweep() {
		System.out.println("扫地。。。");
	}

}
