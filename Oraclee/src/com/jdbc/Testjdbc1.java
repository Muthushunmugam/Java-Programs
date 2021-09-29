package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Testjdbc1 {
	
	static Connection conn;
	static Statement stmt2;
	static ResultSet rs;
	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		int rows;
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Muthu123");
		
		stmt2 = conn.createStatement();
		rows =stmt2.executeUpdate("drop table tab1");
		
		System.out.println("Table Deleted Successfully");
		
		conn.close();
		

	}

}