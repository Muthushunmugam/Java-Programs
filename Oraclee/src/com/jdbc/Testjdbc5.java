package com.jdbc;
import java.sql.*;

public class Testjdbc5 {
	
	static Connection con;
	static Statement st;
	static ResultSet rs;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		int rows;
		
		Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Muthu123");
		
		st = con.createStatement();
		
		rows = st.executeUpdate("create table mobile (No number,Brand varchar(20),Model varchar(20))");
		
		System.out.println("Table created successfully");
		
		con.close();	
		

	}

}
