package com.yu.gof.principle.openclosed;

import java.math.BigDecimal;

public class Customer implements ICustomer {

	private String userName;
    private int level;

    public Customer(String userName, int level) {
        this.userName = userName;
        this.level = level;
    }
    
	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public BigDecimal pay(Goods goods) {
		if (level == 1) {
			return goods.getPrice().multiply(new BigDecimal(0.7)).setScale(2, BigDecimal.ROUND_HALF_UP);
		} else if (level == 2) {
			return goods.getPrice().multiply(new BigDecimal(0.8)).setScale(2, BigDecimal.ROUND_HALF_UP);
		}else if (level == 3) {
			return goods.getPrice().multiply(new BigDecimal(0.9)).setScale(2, BigDecimal.ROUND_HALF_UP);
		}
		return goods.getPrice();
	}

}
