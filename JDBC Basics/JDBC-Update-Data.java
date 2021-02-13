package com.jdbc.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Program4 {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/ics2609";
		String username = "Jherlet";
		String password = "lolipop2145";
		try {
			//build the database connection using your dbURL, username, and password
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			if(conn != null) {
				//build the SQL update statement
				String sql = "UPDATE tblaccounts SET password = ?, usertype = ?, status = ? WHERE username = ?";
				//prepare a statement using the sql statement and connection
				PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
				statement.setString(1, "secretcode123");
				statement.setString(2, " TECHNICAL");
				statement.setString(3, "INACTIVE");
				statement.setString(4, "user3");
				//prepare a variable for executing the update
				int rowUpdated = statement.executeUpdate();
				//check if the update was successful
				if(rowUpdated > 0) {
					System.out.println("User account was successfully updated");
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
