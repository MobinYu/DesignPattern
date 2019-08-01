package com.yu.gof.structurepattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Leader extends Employee {

	private List<Employee> employees;
	
	public Leader(String name) {
		this.setName(name);
		this.employees = new ArrayList<>();
	}
	
	public void add(Employee employee) {
		this.employees.add(employee);
	}

	public void remove(Employee employee) {
		this.employees.remove(employee);
	}
	
	@Override
	public void display(int index) {
		for (int i = 0; i < index; i++) {
			System.out.print("----");
		}
		System.out.println("领导：" + this.getName());
		this.employees.forEach(employee -> {
			employee.display(index + 1);
		});
	}

}
