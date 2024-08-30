package com.examples.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatMessagesEg {
	public static void main(String[] args) {
		ArrayList<String> cmsgs = new ArrayList<>();
		cmsgs.add("P13 - D");
		cmsgs.add("P2 - S");
		cmsgs.add("P9 - d");
		cmsgs.add("P8 - N");
		cmsgs.add("P13 - e");
		cmsgs.add("P5 - Y");
		cmsgs.add("P8 - I");
		cmsgs.add("P9 - completed");

		// 1 - add 3rd element in between, with some text
		cmsgs.add(3, "Trainer - any questions?");

		// 2 - update 4th element with "P10 - I"
		cmsgs.set(4, "p10-I");

		// 3 - remove 2nd element
		cmsgs.remove(2);

		display(cmsgs);

		/*
		 * List all chat messages TBD - How many times a participant responded
		 */

		/*
		 * Iterator forEach enahnced for
		 */
		int done = 0, notdone = 0, error = 0, others = 0;
		for (String msg : cmsgs) {
			if (msg.indexOf("D") > 0 || msg.indexOf("d") > 0 || msg.indexOf("completed") > 0) {
				done++;
			} else if (msg.indexOf("E") > 0 || msg.indexOf("e") > 0) {
				error++;
			} else if (msg.indexOf("N") > 0) {
				notdone++;
			} else {
				others++;
			}
		}

		System.out.println("No. of Done is " + done);
		System.out.println("No. of Not Done is " + notdone);
		System.out.println("No. of Errors is " + error);
		System.out.println("No. of Others is " + others);

		Collections.shuffle(cmsgs);

		System.out.println("Msgs after SHuffling");
		display(cmsgs);
	}

	static void display(List<String> list) {
		for (String str : list) {
			System.out.print(str + "\t");
		}
	}

}
