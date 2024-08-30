package com.examples.week3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// 1. Develop an application using LinkedList,
//and store Chat Messages(as objects), 
//display, reverse and again display reversed LinkedList

class Chatmsgs {

	String name;
	String msg;

	public Chatmsgs(String name, String msg) {
		this.name = name;
		this.msg = msg;

	}

	@Override
	public String toString() {
		return "Chatmsgs [name=" + name + ", msg=" + msg + "]";
	}

}

public class ChatMsgsWithLinkedList {
	public static void main(String[] args) {
		LinkedList<Chatmsgs> cmsgs = new LinkedList<>();
		cmsgs.add(new Chatmsgs("name1", "msg1"));
		cmsgs.add(new Chatmsgs("name2", "msg2"));
		cmsgs.add(new Chatmsgs("name3", "msg3"));
		cmsgs.add(new Chatmsgs("name4", "msg4"));
		
				display(cmsgs);
				Collections.reverse(cmsgs);
				System.out.println();// to get control to the next line
				System.out.println("After reversing------");
				display(cmsgs);

	}
	
	static void display(List<Chatmsgs> cmsgs) {
		for (Chatmsgs cmg : cmsgs) {
			System.out.print(cmg + "\t");
		}
	}
}
