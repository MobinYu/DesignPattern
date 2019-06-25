package com.yu.gof.principle.openclosed;

import java.math.BigDecimal;

public class CustomerLevelC implements ICustomer {

	private String name;
	
	public CustomerLevelC(String name) {
		this.name = name;
	}

	@Override
	public String getUserName() {
		return this.name;
	}

	@Override
	public BigDecimal pay(Goods goods) {
		return goods.getPrice().multiply(new BigDecimal(0.9)).setScale(2, BigDecimal.ROUND_HALF_UP);
	}

}
