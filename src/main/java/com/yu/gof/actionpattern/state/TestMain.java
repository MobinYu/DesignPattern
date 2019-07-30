package com.yu.gof.actionpattern.state;

public class TestMain {

	public static void main(String[] args) {
		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());
		
		StartState stopState = new StartState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());
		
	}

}
