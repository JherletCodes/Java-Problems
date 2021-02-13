package com.jdbc.sample;

//this program shows on how to read the data on a table on a database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program2 {

	public static void main(String[] args) {
		//format://localhost/databasename
		String dbURL = "jdbc:mysql://localhost/ics2609";
		//username of your mysql account
		String username = "Jherlet";
		//password of your mysql account
		String password = "lolipop2145";
		try {
			//build the database connection
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			if (conn != null) {
				//build your select statement
				String sql = "SELECT username, usertype, status, createdby  FROM tblaccounts";
				//create the statement on your connection
				Statement statement = (Statement) conn.createStatement();
				//Build a ResultSet by executing statement and the sql
				ResultSet result = statement.executeQuery(sql);
				int count = 0;
				//loop on the each data on the result
				while(result.next()) {
					//get all the data on the result
					String uname = result.getString("username");
					//String pword = result.getString("password");
					String utype = result.getString("usertype");
					String stat = result.getString("status");
					String createdby = result.getString("createdby");
					//generate the output
					String output = "User #%d: %s - %s - %s - %s";
					System.out.println(String.format(output, ++count, uname, utype, 
							stat, createdby));
				}
			}
		}
		catch(SQLException error) {
			error.printStackTrace();
		}
	}

}
