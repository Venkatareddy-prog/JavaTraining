package com.dbeg.week4;

public class Address {

	private String street;
	private String city;
	private long pin;

	public Address() {
	}

	public Address(String street, String city, long pin) {
		super();
		this.street = street;
		this.city = city;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pin=" + pin + "]";
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreet() {
		return street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	public long getPin() {
		return pin;
	}
}
