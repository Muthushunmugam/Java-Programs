package com.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
public class Testjdbc3 {
	
	static Connection conn;
	static Statement stmt;

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Muthu123");
		stmt = conn.createStatement();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Salary range: ");
		String salRange = br.readLine();
		int sal = Integer.parseInt(salRange);
		System.out.println("Enter Bonus amount: ");
		String bonuss = br.readLine();
		int bonus = Integer.parseInt(bonuss);
		
		
		int rowscount = stmt.executeUpdate("update emp set Salary = Salary + "+bonus+"where Salary <"+salRange);
		
		System.out.println("Number of records updated: "+rowscount);
		
		
		
		

	}

}
