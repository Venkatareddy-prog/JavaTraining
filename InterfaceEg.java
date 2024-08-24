package com.examples;

interface Circle{
	
	double PI = 3.14;
	double getSurfaceArea(double radius);
	double getCircumference(double radius);
}
interface Rectangle{
	//double PI = 3.14;
	double getSurfaceArea(double length);
	double getCircumference(double width);
}

class CircleImpl implements Circle,Rectangle{

	@Override
	public double getSurfaceArea(double radius) {
		return 2*PI*radius;
	}

	@Override
	public double getCircumference(double radius) {
		return PI*radius;
	}
	

 
	 }
 


public class InterfaceEg{
	
	public static void main(String[] args) {
		
		
		Circle crl= new CircleImpl();
		crl.getCircumference(4);
		crl.getSurfaceArea(5);
		CircleImpl  obj = new CircleImpl();
		System.out.println(obj.getCircumference(2));
		System.out.println(obj.getSurfaceArea(3));
		
	}
	
	

}

