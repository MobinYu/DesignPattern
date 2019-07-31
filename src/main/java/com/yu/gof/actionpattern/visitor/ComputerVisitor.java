package com.yu.gof.actionpattern.visitor;

/**
 * -访问者接口
 */
public interface ComputerVisitor {

	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
