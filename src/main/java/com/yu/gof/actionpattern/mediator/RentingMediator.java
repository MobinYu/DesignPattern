package com.yu.gof.actionpattern.mediator;

import java.util.List;

public class RentingMediator extends Mediator {
	
	private HouseOwnerPingFang pingfang = new HouseOwnerPingFang();
	private HouseOwnerYangFang yangfang = new HouseOwnerYangFang();

	@Override
	public void supplyHouse(List<String> types) {
		if (types.contains("pingfang")) {
			pingfang.supply();
		}
		if (types.contains("yangfang")) {
			yangfang.supply();
		}
	}

}
