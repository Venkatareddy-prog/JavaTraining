package com.examples;

abstract class Animal {
	//abstract void move();

	void eat() {
		System.out.println("Animal.method eat()");
	}
}

class Snake extends Animal {

	/*
	 * @Override void move() { System.out.println("Method move()_--- Crawling....");
	 * }
	 */
}

public class AbstractExamples {

	public static void main(String[] args) {
		Animal obj = new Snake();
		//obj.move();
	}

}
