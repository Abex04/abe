package com.itsc;

import java.sql.*;

public class CrateDatabase {

	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/";
		String username = "root";
		String password = "1399";
		String databaseName = "brocode";
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			
			Statement statement =  connection.createStatement();
			String createDatabaseSQL = "CREATE DATABASE " + databaseName;
			statement.executeUpdate(createDatabaseSQL);
			
			System.out.println("Database" + databaseName + " Created Successfully.");
			
			 statement.close();
			 connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			
			
			
			
		}
		
	}

}
