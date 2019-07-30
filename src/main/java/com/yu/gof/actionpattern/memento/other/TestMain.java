package com.yu.gof.actionpattern.memento.other;

public class TestMain {
	
	public static void main(String[] args) {
		Deployment deployment = new Deployment();
		//1、部署应用
		App v1 = new App("application", "1.0.0");
		deployment.setApp(v1);
		deployment.startApp();
		//2、停止应用
		deployment.stopApp();
		Space space = new Space();
		space.setAppBackup(deployment.createAppBackup()); //创建备份，并保存
		//3、部署新应用
		App v2 = new App("application", "2.0.0");
		deployment.setApp(v2);
		deployment.startApp();
		
		System.out.println("启动不了，发现有致命bug！");
		System.out.println("回滚至上一个版本！");
		
		//4、回滚，并启动
		deployment.rollbackAppBackup(space.getAppBackup());
		deployment.startApp();
	}

}
