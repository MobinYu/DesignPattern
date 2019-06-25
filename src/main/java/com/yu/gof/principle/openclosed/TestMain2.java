package com.yu.gof.principle.openclosed;

public class TestMain2 {
	
	public static void main(String[] args) {
		Store store = new Store();
		
		ICustomer xiaoming = new CustomerLevelA("小明");
		store.sellGoods(xiaoming);
		
		ICustomer xiaohua = new CustomerLevelB("小华");
		store.sellGoods(xiaohua);
		
		ICustomer xiaoguo = new CustomerLevelC("小国");
		store.sellGoods(xiaoguo);
	}

}
