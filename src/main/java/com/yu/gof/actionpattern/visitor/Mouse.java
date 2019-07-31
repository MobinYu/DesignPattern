package com.yu.gof.actionpattern.visitor;

public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerVisitor visitor) {
		visitor.visit(this);
	}

}
