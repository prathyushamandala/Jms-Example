package com.visam.java.JdbcConnectivity;

import java.sql.*;

public class PostgresConnectivityDB {

	public static void main(String args[]){
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BookWebApplication","postgres","root");
			System.out.println("connection established");
			
		}
		catch(Exception e){
			
	}

	}
}
