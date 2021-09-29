package com.jdbc;
import java.sql.*;
import java.util.Scanner;

public class Testjdbc6 {
	
	static Connection con;
	static Statement st;
	static ResultSet rs;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		int rows;
		
		Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Muthu123");
		
		st = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Mobile brand: ");
		String brand = sc.nextLine();
		
		System.out.println("Enter Model: ");
		String model = sc.nextLine();
		
		System.out.println("Enter serial number: ");
		int no = sc.nextInt();
		
		rows = st.executeUpdate("Insert into mobile values('"+no+"','"+brand+"','"+model+"')");
		if(rows>0) {
			System.out.println("Values added");
		}
		
		
		con.close();	
		

	}

}