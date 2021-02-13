package com.jdbc.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program1 {

	public static void main(String[] args) {
		//format://localhost/databasename
		String dbURL = "jdbc:mysql://localhost/ics2609";
		//username of your mysql account
		String username = "Jherlet";
		//password of your mysql account
		String password = "lolipop2145";
		try {
			//build the database connection using your dbURL, username, and password
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			//check if the connection is not open
			if(conn != null) {
				System.out.println("Connected");
			}
		}
		catch(SQLException error) {
			error.printStackTrace();
		}
	}


}
