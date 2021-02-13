package com.jdbc.sample;

//this program shows on how to insert data on the table

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program3 {

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
			if (conn != null) {
				//build insert sql statement
				String sql = "INSERT INTO tblaccounts (username, password, usertype, status, createdby) VALUES (?, ?, ?, ?, ?)";
				//Prepare the statement
				PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
				//set data on the question marks of the sql statement
				statement.setString(1, "user3");
				statement.setString(2, "secrets");
				statement.setString(3, "TECHNICAL");
				statement.setString(4, "ACTIVE");
				statement.setString(5, "admin");
				//update the statement
				int rowInserted = statement.executeUpdate();
				//check if insertion is successful
				if (rowInserted > 0) {
					System.out.println("A new user was added");
				}
			}
		}
		catch(SQLException error) {
			error.printStackTrace();
		}
		
		
	}

}
