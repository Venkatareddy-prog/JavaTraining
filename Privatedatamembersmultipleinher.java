package com.Inheritance;

class A{
	private int i;

	A(int i)
	{
		this.i/* data member*/ = i/*parameter*/;
		System.out.println("A(int i)");
	}
	
	public void show()
	{
		System.out.println("Value of A.i is:"+i);
	}
}

class B extends A{
	private int j;
	public B(int p,int j)
	{
		super(p); //shud be first statment in cosntructor
		this.j = j; 
		System.out.println("B(int i,int j)");
	}
	public void show()
	{
		super.show();
		System.out.println("Value of B.j is:"+j);
	}
}

class C extends B{
	private int k;
	public C(int i,int j,int k)
	{
		super(i,j);
		this.k = k;
		System.out.println("C(int i,int j,int k)");
	}
	
	public void show()
	{
		
		System.out.println("Value of C.k is:"+k);
		super.show();
	}
}
class D extends C{
	
	private float I;

	public D(int i, int j, int k,float I) {
		super(i, j, k);
		this.I=I;
		System.out.println("D(int i,int j,int k,float I)");
		
		
	}
	public void show()
	{
		
		System.out.println("Value of D.I is:"+I);
		super.show();
	}
}


public class Privatedatamembersmultipleinher {

	public static void main(String[] args) {
		D obj = new D(10,20,30,50.0f);
		obj.show();
	}

}
