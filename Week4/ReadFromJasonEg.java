package com.dbeg.week4;

import java.io.FileInputStream;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadFromJasonEg {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		FileInputStream fis = new FileInputStream("person.json");
		ObjectMapper mapper = new ObjectMapper();
		Person obj = mapper.readValue(fis, Person.class);
		
		System.out.println(obj);

	}

}
