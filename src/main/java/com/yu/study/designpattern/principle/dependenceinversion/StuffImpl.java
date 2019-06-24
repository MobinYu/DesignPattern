package com.example.demo.study.designpattern.principle.dependenceinversion;

public class StuffImpl extends Stuff {

	public StuffImpl(String name) {
		this.setName(name);
	}

	@Override
	void service() {
		//TODO
		System.out.println(this.getName() + "提供服务！");
	}

	@Override
	void askHelp(Boss boss) {
		// TODO
		boss.support();
	}

}
