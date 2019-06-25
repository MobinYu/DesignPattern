package com.yu.gof.principle.openclosed;

import java.math.BigDecimal;

public class TestMain1 {

	public static void main(String[] args) {
		Goods goods = new Goods("x牌洗发水", new BigDecimal(50));
		
		Customer c1 = new Customer("小明", 1);
		System.out.println("小明实付款：" + c1.pay(goods));
		
		Customer c2 = new Customer("小华", 2);
		System.out.println("小明实付款：" + c2.pay(goods));
		
		Customer c3 = new Customer("小国", 3);
		System.out.println("小明实付款：" + c3.pay(goods));
		
		/* 该方式实现，想要扩展一个level是4的，就需要修改 Customer代码，不符合开闭原则 */
		/* 此时，就需要将将不同折扣的用户，分别建立成独立接口 */
	}
}
