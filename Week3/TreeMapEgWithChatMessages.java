package com.examples.week3;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapEgWithChatMessages {
	public static void main(String[] args) {
		TreeMap<String, String> tm= new TreeMap<>((c1,c2)->(c2.compareTo(c1)));
		tm.put("name1", "msg11");
		tm.put("name2", "msg21");
		tm.put("name3", "msg31");
		tm.put("name4", "msg41");
		
		
		Set<String> ss=tm.keySet();
	for (String key_item : ss) {
		System.out.println(key_item +"---->"+ tm.get(key_item));
		
	}
	
	}
	

}
