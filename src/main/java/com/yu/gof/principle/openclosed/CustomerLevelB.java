package com.yu.gof.principle.openclosed;

import java.math.BigDecimal;

public class CustomerLevelB implements ICustomer {

	private String name;
	
	public CustomerLevelB(String name) {
		this.name = name;
	}

	@Override
	public String getUserName() {
		return this.name;
	}

	@Override
	public BigDecimal pay(Goods goods) {
		return goods.getPrice().multiply(new BigDecimal(0.8)).setScale(2, BigDecimal.ROUND_HALF_UP);
	}

}
