package com.yu.gof.principle.dependenceinversion;

public class BossImpl extends Boss {

	public BossImpl(Stuff stuff) {
		super(stuff);
	}

	@Override
	void support() {
		this.getStuff().service();
	}

	@Override
	void askHelp(Boss boss) {
		boss.support();
	}

}
