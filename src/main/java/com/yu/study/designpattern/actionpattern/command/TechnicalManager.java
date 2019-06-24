package com.example.demo.study.designpattern.actionpattern.command;

/**
 * -技术经理
 * @author Administrator
 * @date 2019年6月24日 下午4:25:22
 */
public class TechnicalManager {
	
	private String name;
	private Command command;

	public TechnicalManager(String name) {
		this.name = name;
	}
	
	public void action(Requirement requirement) {
		this.command.execute(requirement);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

}
