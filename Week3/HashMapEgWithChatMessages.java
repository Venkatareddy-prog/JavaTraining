package com.examples.week3;

import java.util.HashMap;
import java.util.Set;

public class HashMapEgWithChatMessages {
	public static void main(String[] args) {
		HashMap<String, String> hm= new HashMap<>();
		hm.put("name1", "msg11");
		hm.put("name2", "msg21");
		hm.put("name3", "msg31");
		hm.put("name4", "msg41");
		
		Set<String> ss=hm.keySet();
	for (String key_item : ss) {
		System.out.println(key_item +"---->"+ hm.get(key_item));
		
	}
	
	}
	

}
