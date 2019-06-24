package com.example.demo.study.designpattern.actionpattern.command;

public class CommandDevelop extends Command {

	public CommandDevelop(Developer developer) {
		super(developer);
	}

	@Override
	public void execute(Requirement requirement) {
		this.developer.develop(requirement);
	}

}
