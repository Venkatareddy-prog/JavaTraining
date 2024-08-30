package com.examples.week3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Country {
	private String name;
	private double gdp;

	public Country(String name, double gdp) {
		// super();
		this.name = name;
		this.gdp = gdp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGdp(double gdp) {
		this.gdp = gdp;
	}

	public String getName() {
		return this.name;
	}

	public double getGdp() {
		return this.gdp;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", gdp=" + gdp + "]";
	}
}

public class TreesetEg {
	public static void main(String[] args) {
		/*
		 * TreeSet<String> tss = new TreeSet<>(new MyComparator());
		 * 
		 * tss.add("city4"); tss.add("city2"); tss.add("city1"); tss.add("city3");
		 * tss.add("city5");
		 */
		/*
		 * Comparator<Country> cc = new Comparator<Country>() {
		 * 
		 * public int compare(Country c1, Country c2) {
		 * 
		 * return (int) (c2.getGdp() - c1.getGdp()); }
		 * 
		 * };
		 */
//Lambda expression
		TreeSet<Country> tss = new TreeSet<Country>(
		//(c1, c2) -> {return (int) (c2.getGdp() - c1.getGdp());}
		(c1, c2) ->(int)(c2.getGdp() - c1.getGdp()));
		tss.add(new Country("Country1", 123));
		tss.add(new Country("Country2", 124));
		tss.add(new Country("Country3", 121));
		tss.add(new Country("Country3", 125));
		
		Country c= Collections.min(tss,(c1, c2) -> (int)(c2.getGdp() - c1.getGdp()));

		Iterator<Country> itr = tss.iterator();

		for (; itr.hasNext();) {
			System.out.println(itr.next());
		}
	}
}
