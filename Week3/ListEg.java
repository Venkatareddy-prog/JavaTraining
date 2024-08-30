package com.examples.week3;

//import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class City{
	private String name;
	private long pincode;
	private String state;
	
	//constructor
	public City(String name, long pincode, String capital_city) {
		this.name = name;
		this.pincode = pincode;
		this.state = capital_city;
	}
	
	//getter, setter - TBD
	
	@Override
	public int hashCode() {
		return Objects.hash(name, pincode, state);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(name, other.name) && pincode == other.pincode && Objects.equals(state, other.state);
	}

	//toString
	@Override
	public String toString() {
		return "City [name=" + name + ", pincode=" + pincode + ", state=" + state + "]";
	}
}

public class ListEg {
public static void main(String[] args) {
	//create List
	List<City> cities = new ArrayList<City>();
	Scanner scnr = new Scanner(System.in);
	
	//add City objects to List
	cities.add(new City("city1", 1234, "capital1"));
	cities.add(new City("city2", 3456, "capital2"));
	
	System.out.println("Please enter city name");
	String icity = scnr.next();
	
	System.out.println("Please enter pincode");
	long ipincode = scnr.nextLong();
	
	System.out.println("Please enter State name");
	String istate = scnr.next();
	
	cities.add(new City(icity, ipincode, istate));
	display(cities,"Before reversing");
	
	Collections.reverse(cities);
	
	display(cities,"Aftr reversing");
	
	
	// by using for each loop
	for (City city : cities) {
		System.out.println(city);
		
	}
		
	System.out.println("using while loop");
	// by using while
	//iterate and display
		Iterator<City> itr = cities.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	
	
}
private static void display(List<City> lcity, String msg) {
	System.out.println(msg);
	Iterator<City> itr = lcity.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
}


	
}
