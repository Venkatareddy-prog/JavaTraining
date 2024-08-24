package com.Inheritance;

public class MainProgram {

	public static void main(String[] args) {
		PermanentEmplyee obj = new PermanentEmplyee(245,"Addr1");
		obj.displayP();
		System.out.println("second object\n");
		PermanentEmplyee obj1 = new PermanentEmplyee(111,"name111",245,"Addr1");
		obj1.displayP();
		TemporaryEmployee obj2 = new TemporaryEmployee(2012,2024);
		obj2.displayP();
		}
		}
