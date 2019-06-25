package com.yu.gof.principle.dependenceinversion;

/**
 * 依赖倒置原则
 * 
 * @author Administrator
 * @date 2019年6月20日 下午5:53:34
 */
public class TestMain {
	
	public static void main(String[] args) {
		Stuff stuffA = new StuffImpl("A 员工");
		Stuff stuffB = new StuffImpl("B 员工");
		
		Boss boss1 = new BossImpl(stuffA);
		Boss boss2 = new BossImpl(stuffB);
		
		boss1.askHelp(boss2); //老板1向boss2请求帮忙
		boss2.askHelp(boss1); //老板2向boss1请求帮忙
	}

}
