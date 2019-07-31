package com.yu.gof.actionpattern.visitor.other;

public class CompanyTencent implements Company {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void entertainProvincialLeader() {
        System.out.println("Tencent 接待省级领导：十二菜两汤");
    }

    public void entertainCityLeader() {
        System.out.println("Tencent 接待市级领导：十菜两汤");
    }

}
