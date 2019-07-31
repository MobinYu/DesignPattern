package com.yu.gof.actionpattern.visitor.other;

public class TestMain {

	public static void main(String[] args) {
		CompanyAlibaba alibaba = new CompanyAlibaba();
		CompanyTencent tencent = new CompanyTencent();
		
		Visitor visitor = new VisitorProvincialLeader();
		visitor.visit(alibaba);
		
		visitor.visit(tencent);
		
	}

}
