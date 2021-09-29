package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Testjdbc {
	
	static Connection conn;
	static Statement stmt,stmt1;
	static ResultSet rs;
	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		int rows;
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Muthu123");
		/*
		stmt = conn.createStatement();
		stmt.executeUpdate("create table tab1(id number,name varchar(20),addr varchar(30))");
		*/
        stmt1 = conn.createStatement();
		rows =stmt1.executeUpdate("Insert into tab1 values(10,'Muthu','Coimbatore')");
		if(rows>0) {
			System.out.println("Values added");
		}
		System.out.println("Table created Successfully");
		
		conn.close();
		

	}

}
