package com.dbeg.week4;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class WriteandReadJasonEg2 {
	static ObjectMapper mapper;
	static ObjectNode node;

	public static void main(String[] args) throws Exception {

		mapper = new ObjectMapper();
		node = mapper.createObjectNode();
		node.put("name", "ravi");
		node.put("age", 25);
		FileOutputStream fos = new FileOutputStream("operson.json");
		mapper.writeValue(fos, node);
		read();
	}

	public static void read() throws Exception {
		FileInputStream fis = new FileInputStream("operson.json");
		node = (ObjectNode) mapper.readTree(fis);
		String str = mapper.writeValueAsString(node);
		System.out.println(str);

	}

}
