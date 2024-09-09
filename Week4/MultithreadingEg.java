package com.dbeg.week4;

class PrintOdd extends Thread {

	String str = " Hi iam using child threading";

	@Override
	public void run() {
		try {
			for (int i = 0; i < str.length(); i++) {
				System.out.print(str.charAt(i) + "\t");
				System.out.println();
				Thread.sleep(30);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class MultithreadingEg {
	public static void main(String[] args) {
		String str2 = " Hi iam using mains threading ";
		try {
			PrintOdd thread = new PrintOdd();

			thread.start();

			for (int i = 0; i < str2.length(); i++) {
				System.out.print(str2.charAt(i) + "\t");
				Thread.sleep(25);
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
