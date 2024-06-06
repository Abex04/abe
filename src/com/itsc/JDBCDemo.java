package com.itsc;
import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			String  driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/StudentsDB";
			String username = "root";
			String password = "1399";
			
			conn = DriverManager.getConnection(url, username, password); // We're establishing connection at this step.
			
			System.out.println("Established Connection");
			
		}catch (Exception e){
			
			e.printStackTrace();
			
		} finally {
			
			if (conn != null) {
				try {
					conn.close(); // We're closing the connection at this stage where we established earlier.
					System.out.println("Connection closed successfuly!");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}		
		}

	}

}
