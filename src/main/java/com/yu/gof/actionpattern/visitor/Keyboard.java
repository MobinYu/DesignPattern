package com.yu.gof.actionpattern.visitor;

public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerVisitor visitor) {
		visitor.visit(this);
	}

}
