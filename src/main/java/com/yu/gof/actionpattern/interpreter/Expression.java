package com.yu.gof.actionpattern.interpreter;

/**
 * -表达式接口
 */
public interface Expression {

	public boolean interpret(String context);
}
