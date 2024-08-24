package com.Inheritance;

public class PermanentEmplyee extends Employee{
	private float salary;
	private String addr;
	public PermanentEmplyee(float salary, String addr) {
	super(); //calling base class  constructor
	this.salary = salary;
	this.addr = addr;
	}
	public PermanentEmplyee(int eid,String ename,float salary, String addr) {
	super(eid,ename); //calling base class customized constructor
	this.salary = salary;
	this.addr = addr;
	}
	public float getSalary() {
	return salary;
	}
	public void setSalary(float salary) {
	this.salary = salary;
	}
	public String getAddr() {
	return addr;
	}
	public void setAddr(String addr) {
	this.addr = addr;
	}
	public void displayP() {
	displaye();
	System.out.println("Employee salary : "+salary+"\nAddress : "+addr);
	}
	}

