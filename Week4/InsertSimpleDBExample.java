package com.dbeg.week4;

// https://codefile.io/f/cbcJx9wUjf

//Java program to set up connection and get all data from table
import java.sql.*;

public class InsertSimpleDBExample {
	public static void main(String arg[]) {
		Connection connection = null;
		try {
			// below two lines are used for connectivity.
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sept2", "root", "pass@word1");

			// mydb is database
			// mydbuser is name of database
			// mydbuser is password of database

			PreparedStatement ps = connection.prepareStatement("insert into messages values (?,?,?)");

			ps.setInt(1, 2);
			ps.setString(2, "name5");
			ps.setString(3, "msg5");
			int nrecs = ps.executeUpdate();
			System.out.println("Insert records" + nrecs + "Successfully");
			// resultSet.close();
			ps.close();
			connection.close();
		} catch (Exception exception) {
			System.out.println(exception);
		}
	} // function ends
} // class ends
