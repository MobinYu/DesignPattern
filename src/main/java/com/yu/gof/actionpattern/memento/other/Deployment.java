package com.yu.gof.actionpattern.memento.other;

public class Deployment {

	private App app;
	
	// 创建应用的备份
	public AppBackup createAppBackup() {
		return new AppBackup(app);
	}
	
	// 从备忘录恢复应用
	public void rollbackAppBackup(AppBackup appBackup) {
		this.app = appBackup.getApp();
	}
	
	// 显示应用的信息
	public void showApp() {
		System.out.println(this.app.toString());
	}

	// 暂停应用
	public void stopApp() {
		System.out.println("暂停应用：" + this.app.toString());
	}

	// 启动应用
	public void startApp() {
		System.out.println("启动应用：" + this.app.toString());
	}

	public App getApp() {
		return app;
	}

	public void setApp(App app) {
		this.app = app;
	}
	
}
