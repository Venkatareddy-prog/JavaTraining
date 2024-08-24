package com.Inheritance;

public class TemporaryEmployee extends Employee{
	private int startyear;
	private int endyear;
	public TemporaryEmployee(int startyear, int endyear) {
	super(); //calling base class default constructor
	this.startyear = startyear;
	this.endyear = endyear;
	}
	public TemporaryEmployee(int eid,String ename,int startyear, int endyear) {
	super(eid,ename); //calling base class overridded constructor
	this.startyear = startyear;
	this.endyear = endyear;
	}
	public float getstartyear() {
	return startyear;
	}
	public void setstartyear(int startyear) {
	this.startyear = startyear;
	}
	public int getendyear() {
	return endyear;
	}
	public void setendyear(int endyear) {
	this.endyear = endyear;
	}
	public void displayP() {
	displaye();
	System.out.println("Employee startyear : "+startyear+"\nendyear : "+endyear);
	}
}
 