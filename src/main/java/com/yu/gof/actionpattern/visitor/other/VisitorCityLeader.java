package com.yu.gof.actionpattern.visitor.other;

public class VisitorCityLeader implements Visitor {

	@Override
	public void visit(CompanyAlibaba companyAlibaba) {
		companyAlibaba.entertainCityLeader();
	}

	@Override
	public void visit(CompanyTencent companyTencent) {
		companyTencent.entertainCityLeader();
	}

}
