package com.yu.gof.actionpattern.command;

public class CommandSuspend extends Command {

	public CommandSuspend(Developer developer) {
		super(developer);
	}

	@Override
	public void execute(Requirement requirement) {
		this.developer.suspend(requirement);
	}

}
