package com.yu.gof.actionpattern.interpreter;

public class ExpressionOr implements Expression {

	private Expression expr1 = null;
	private Expression expr2 = null;
	
	public ExpressionOr(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean interpret(String context) {
		return expr1.interpret(context) || expr2.interpret(context);
	}

}
