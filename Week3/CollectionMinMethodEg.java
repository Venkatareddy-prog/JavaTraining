package com.examples.week3;

import java.util.Collections;
import java.util.TreeSet;

class State {
	private String name;
	private double gdp;

	public State(String name, double gdp) {
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

public class CollectionMinMethodEg {
	public static void main(String[] args) {

//Lambda expression
		TreeSet<State> tss = new TreeSet<>((c1, c2) -> (int) (c2.getGdp() - c1.getGdp()));

		tss.add(new State("Country1", 123));
		tss.add(new State("Country2", 124));
		tss.add(new State("Countr4", 121));
		tss.add(new State("Country5", 125));

		State c = Collections.min(tss, (c1, c2) -> (int) (c1.getGdp() - c2.getGdp()));

		State max = Collections.max(tss, (c1, c2) -> (int) (c1.getGdp() - c2.getGdp()));
		State minc = Collections.min(tss, (c1, c2) -> (int) (c1.getName().compareTo(c2.getName())));
		State maxc = Collections.max(tss, (c1, c2) -> (int) (c1.getName().compareTo(c2.getName())));

		System.out.println(c);
		System.out.println(max);
		System.out.println(maxc);

	}
}
