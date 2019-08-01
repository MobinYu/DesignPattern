package com.yu.gof.structurepattern.composite;

public class TestMain {
	
	public static void main(String[] args) {
		Leader manage = new Leader("大宝"); //经理
		Leader leader = new Leader("二宝"); //组长
		
		Engineer engineer1 = new Engineer("e1");
		Engineer engineer2 = new Engineer("e2");
		
		manage.add(leader);
		leader.add(engineer1);
		leader.add(engineer2);
		
		manage.display(0);
	}

}
