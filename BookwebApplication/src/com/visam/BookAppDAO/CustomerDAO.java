package com.visam.BookAppDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDAO {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BookWebApplication","postgres","root");
			System.out.println("connection established");
			Statement stmt = con.createStatement();
			String sql = "CREATE TABLE  IF NOT EXISTS customer"+"(userid INT PRIMARY KEY NOT NULL,"+"name TEXT NOT NULL,"+" email TEXT NOT NULL)";
			stmt.executeUpdate(sql);
			//String ins = "INSERT INTO customer(userid,name,email)"+" VALUES(1,'Arun','arun@gmail.com')";
			//stmt.executeUpdate(ins);
	
		    String sql1 = "CREATE TABLE IF NOT EXISTS Bookinfo "+"(id INT PRIMARY KEY NOT NULL,"+" name TEXT NOT NULL,"+" author TEXT NOT NULL,"+" price FLOAT NOT NULL)";
		    stmt.executeUpdate(sql1);
		   //String bins = "INSERT INTO Bookinfo (id,name,author,price)"+" VALUES(1001,'Head First Java','KathySierra,BertBates',100)";
		    //stmt.executeUpdate(bins);
		    String bins1= "INSERT INTO Bookinfo (id,name,author,price)"+" VALUES(1002,'A Beginner's Guide','HerbertSchildt',200)";
		    stmt.executeUpdate(bins1);
		    stmt.close();
			con.close();
		

	}
}


