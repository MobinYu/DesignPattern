package com.example.demo.study.designpattern.actionpattern.mediator;

import java.util.List;

/**
 * -租户
 * @author Administrator
 * @date 2019年6月24日 下午4:44:36
 */
public class Tenant {
	
	private String name;
	private List<String> wantTypes;
	
	private RentingMediator RentingMediator = new RentingMediator();

	public Tenant(String name, List<String> wantTypes) {
		this.name = name;
		this.wantTypes = wantTypes;
	}
	
	public void lookHouse() {
		RentingMediator.supplyHouse(wantTypes);
	}

}
