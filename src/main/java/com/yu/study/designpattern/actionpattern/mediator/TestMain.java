package com.example.demo.study.designpattern.actionpattern.mediator;

import java.util.Arrays;

public class TestMain {
	
	public static void main(String[] args) {
		Tenant xiaoming = new Tenant("xiaoming", Arrays.asList("yangfang"));
		
		xiaoming.lookHouse();
		
		
		
	}

}
