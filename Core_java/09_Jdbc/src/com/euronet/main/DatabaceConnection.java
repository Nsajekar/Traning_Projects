package com.euronet.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaceConnection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("JDBC driver loaded Succesfully");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/euronetdb", "root", "root");
			System.out.println("Connection established Succesfully");
			if(connection != null){
				connection.close();
				System.out.println("Connection closed Succesfully");
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("failed to create connection");
			e.printStackTrace();
		}
	}
}
