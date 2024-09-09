package com.dbeg.week4;

import java.util.Arrays;

class Person {
	private int agee;
	private String name;
//	private Address address;
	private Address[] address;

	public Person() {

	}

	public Person(int agee, String name, Address[] address) {
		super();
		this.agee = agee;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [age=" + agee + ", name=" + name + ", address=" + Arrays.toString(address) + "]";
	}

	public void setAgee(int agee) {
		this.agee = agee;
	}

	public int getAge() {
		return agee;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddress(Address[] address) {
		this.address = address;
	}

	public Address[] getAddress() {
		return address;
	}
}
