package com.dbeg.week4;

import java.io.FileOutputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteJsonEG {
	public static void main(String[] args) throws Exception {
		// Address addrs = new Address("Street1", "City1", 123456);
		/*
		 * Address[] addrs = new Address[2]; addrs[0] = new Address("street1", "city1",
		 * 1234561); addrs[1] = new Address("street2", "city2", 1234562);
		 */
		Address[] addrs = { new Address("street1", "city1", 1234561), new Address("street2", "city2", 1234562) };

		Person prs = new Person(20, "Ravi", addrs);

		ObjectMapper mapper = new ObjectMapper();

		FileOutputStream fos = new FileOutputStream("person.json");
		mapper.writeValue(fos, prs);
		System.out.println(mapper.writeValueAsString(prs));
	}
}
