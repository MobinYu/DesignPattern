package com.yu.gof.principle.openclosed;

import java.math.BigDecimal;

public interface ICustomer {

	public String getUserName();
	
	public BigDecimal pay(Goods goods);
}
