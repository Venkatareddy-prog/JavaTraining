package com.Inheritance;

class Vehicle {
	String vname;

	Vehicle(String name) {
		this.vname = name;
	}

	public void start() {
		System.out.println(vname + " is starting.");
	}
}

class Car extends Vehicle {
	Car(String name) {
		super(name);
	}

	@Override

	public void start() {
		System.out.println(vname + " (Car) is starting.");
	}
}

// Derived class 2
class Bus extends Vehicle {
	Bus(String name) {
		super(name);
	}

	@Override
	public void start() {
		System.out.println(vname + " (Bus) is starting.");
	}
}

public class VehicleExample {

	public static void main(String[] args) {

		Vehicle[] vehicles = new Vehicle[2];

		vehicles[0] = new Car("TataPunch ");
		vehicles[1] = new Bus("TSRTC");

		for (Vehicle vehicle : vehicles) {
			vehicle.start();
		}
	}
}