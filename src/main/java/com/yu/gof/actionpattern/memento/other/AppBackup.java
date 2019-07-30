package com.yu.gof.actionpattern.memento.other;

/**
 * -应用备份（充当备忘录角色）
 */
public class AppBackup {

	private App app;

	public AppBackup(App app) {
		this.app = app;
	}

	public App getApp() {
		return app;
	}

	public void setApp(App app) {
		this.app = app;
	}
	
}
