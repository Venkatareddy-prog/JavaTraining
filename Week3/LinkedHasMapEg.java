package com.examples.week3;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHasMapEg {
	public static void main(String[] args) {

		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("key1", "value1");
		lhm.put("key2", "value2");
		lhm.put("key3", "value3");
		lhm.put("key1", "value1");
		lhm.put("key4", "value4");

		Set<String> s = lhm.keySet();
		for (String item_key : s) {
			System.out.println(item_key + "---->" + lhm.get(item_key));

		}

		// using EntrySet
		Set<Entry<String, String>> ess = lhm.entrySet();

		for (Entry<String, String> entry : ess) {
			System.out.println(entry.getKey() + entry.getValue());

		}

	}

}
