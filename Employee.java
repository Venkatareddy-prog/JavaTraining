
package com.Inheritance;

public class Employee {

	private int id;
	private String name;

	Employee() {
		System.out.println("Default Constructor of class");
	}

	public Employee(int id, String name) {
		System.out.println("customised Constructor");
		this.id = id;
		this.name = name;
	}

	public int getEid() {
		return id;
	}

	public void setEid(int eid) {
		this.id = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displaye() {
		System.out.println("Employee id " + id + "\nName " + name);
	}
}
