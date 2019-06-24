package com.example.demo.study.designpattern.actionpattern.command;

/**
 * -开发人员
 * @author Administrator
 * @date 2019年6月24日 下午4:24:45
 */
public class Developer {

	private String name;
	
	public Developer(String name) {
		this.name = name;
	}

	//需求开发
	public void develop(Requirement requirement) {
		System.out.println(name + "-->开始开发需求： " + requirement.getName());
	}
	
	//需求中止
	public void suspend(Requirement requirement) {
		System.out.println(name + "-->中止开发需求： " + requirement.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
