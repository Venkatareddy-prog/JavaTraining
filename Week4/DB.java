package com.dbeg.week4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

	public static void getConnection() {

		// load driverlass
		try {
			Class.forName(DRIVER_NAME);

			// connection to db server
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sept2", "root", "pass@word1");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}