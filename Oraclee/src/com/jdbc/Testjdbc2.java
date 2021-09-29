package com.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Testjdbc2 {
	
	static Connection conn;
	static Statement st;
	static ResultSet rs;
	
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		
		int rows;
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Muthu123");
		st = conn.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String n = sc.nextLine();
		System.out.println("Enter Address: ");
		String addr = sc.nextLine();
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		
		
		
		
		rows =st.executeUpdate("Insert into tab1 values('"+id+"','"+n+"','"+addr+"')");
		if(rows>0) {
			System.out.println("Values added");
		}
		System.out.println("Table created Successfully");
		
		conn.close();
	}

}


