package com.yu.gof.actionpattern.visitor;

public class TestMain {

	public static void main(String[] args) {
		ComputerPart computer = new Keyboard();
		computer.accept(new ComputerPartVisitor());
	}

}
