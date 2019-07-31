package com.yu.gof.actionpattern.visitor.other;

public class VisitorProvincialLeader implements Visitor {

	@Override
	public void visit(CompanyAlibaba companyAlibaba) {
		companyAlibaba.entertainProvincialLeader();
	}

	@Override
	public void visit(CompanyTencent companyTencent) {
		companyTencent.entertainProvincialLeader();
	}

}
