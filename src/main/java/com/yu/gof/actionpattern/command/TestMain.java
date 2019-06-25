package com.yu.gof.actionpattern.command;

public class TestMain {
	
	public static void main(String[] args) {
		Requirement requirement = new Requirement("新增黑名单");
		
		TechnicalManager manager = new TechnicalManager("大明");
		Developer xiaoMing = new Developer("小明");
		//需求开始命令
		System.out.println("开始");
		Command cmd1 = new CommandDevelop(xiaoMing);
		manager.setCommand(cmd1);
		manager.action(requirement);
		
		//需求中止命令
		System.out.println("变更");
		Command cmd2 = new CommandSuspend(xiaoMing);
		manager.setCommand(cmd2);
		manager.action(requirement);
	}

}
