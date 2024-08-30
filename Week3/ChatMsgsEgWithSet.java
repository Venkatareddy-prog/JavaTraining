package com.examples.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

// 1. Develop an application using LinkedList,
//and store Chat Messages(as objects), 
//display, reverse and again display reversed LinkedList

class Chats {

	String name;
	String msg;

	public Chats(String name, String msg) {
		this.name = name;
		this.msg = msg;

	}

	@Override
	public String toString() {
		return "Chatmsgs [name=" + name + ", msg=" + msg + "]";
	}

}

public class ChatMsgsEgWithSet {
	public static void main(String[] args) {
		TreeSet<Chats> cmsgs = new TreeSet<>((c1, c2) -> (c1.name + c1.msg).compareTo(c2.name + c2.msg));
		cmsgs.add(new Chats("name1", "msg1"));
		cmsgs.add(new Chats("name2", "msg2"));
		cmsgs.add(new Chats("name1", "msg3"));
		cmsgs.add(new Chats("name4", "msg4"));

		display(cmsgs);

		Chats s = Collections.min(cmsgs, (c1, c2) -> (c1.msg.compareTo(c2.msg)));
		System.out.println("minimum of the strings");
		System.out.println(s);
		System.out.println("for filtering with single name------");
		cmsgs.stream().filter((e) -> e.name.equalsIgnoreCase("name1")).forEach((items) -> {
			System.out.println(items);
		});
		System.out.println("------------");

		System.out.println("-------for filtering with multiple name------");
		cmsgs.stream().filter((e) -> e.name.equalsIgnoreCase("name1") || e.name.equalsIgnoreCase("name2"))
				.forEach((items) -> {
					System.out.println(items);
				});
		System.out.println("------------");

	}

	static void display(TreeSet<Chats> cmsgs) {
		for (Chats cmg : cmsgs) {
			System.out.println(cmg + "\t");
		}
	}
}
