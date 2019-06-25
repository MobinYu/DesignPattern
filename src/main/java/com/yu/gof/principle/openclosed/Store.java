package com.yu.gof.principle.openclosed;

import java.math.BigDecimal;

public class Store {

	Goods goods = new Goods("x牌洗发水", new BigDecimal(49));
	
	public void sellGoods(ICustomer customer) {
		System.out.println(customer.getUserName() + "买" + goods.getName() + "花了" + customer.pay(goods));
	}
}
