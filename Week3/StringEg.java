package com.examples.week3;

public class StringEg {

	public static void main(String[] args) {
		String str = "This, is , to test";

		int index = str.indexOf(",");
		String substr = str.substring(0, index);
		System.out.println(substr);
		int lindex = str.lastIndexOf(",");
		str.substring(lindex + 1);

		String[] splitStr = str.split(",");
		for (String s : splitStr) {
			System.out.print(s+"\t");
			
			

		}
	}

}
