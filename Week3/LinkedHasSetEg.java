package com.examples.week3;

import java.util.LinkedHashSet;

public class LinkedHasSetEg {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs= new LinkedHashSet<String>();
		lhs.add("aaaa");
		lhs.add("bbbb");
		lhs.add("aaaa");
		lhs.add("ccccc");
		
		lhs.stream().forEach((item)->{System.out.println(item);});
	}
}
