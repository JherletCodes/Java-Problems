package com.jdbc.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Program5 {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/ics2609";
		String username = "Jherlet";
		String password = "lolipop2145";
		try {
			//build the database connection using your dbURL, username, and password
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			//check if connection is open
			if(conn != null) {
				//build the SQL delete statement
				String sql = "DELETE FROM tblaccounts WHERE username = ? OR username = ?";
				//prepare a statement using the sql statement and connection
				PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
				//set a value to the ? the username of the account you want to delete
				statement.setString(1, "user3");
				statement.setString(2, "user3");
				//variable for counting the account/s deleted
				int rowDeleted = statement.executeUpdate();
				if(rowDeleted > 0) {
					System.out.println("User account was deleted");
				}
				else {
					System.out.println("User not found");
				}
			}
		}
		catch (SQLException error) {
			error.printStackTrace();
		}
	}
}
