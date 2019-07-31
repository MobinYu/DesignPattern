package com.yu.gof.actionpattern.visitor;

/**
 * -接受访问接口
 */
public interface ComputerPart {

	public void accept(ComputerVisitor visitor);
}
