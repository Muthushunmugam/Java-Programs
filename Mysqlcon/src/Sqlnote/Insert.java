package Sqlnote;

import java.sql.*;


public class Insert {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/sonoo";
	static final String USER = "root";
	static final String PASS = "Admin@123";
	//static final String QUERY = "SELECT * FROM Record";
	
	public static void main(String[]args) {
		
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ){
			
			 System.out.println("Inserting records into the table...");          
	         String sql = "INSERT INTO Record VALUES (100, 'Rohit', 'Day')";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO Record VALUES (101, 'Mahnaz', 'Day')";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO Record VALUES (102, 'Zaid', 'Day')";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO Record VALUES(103, 'Sumit', 'Night')";
	         stmt.executeUpdate(sql);
	         System.out.println("Inserted records into the table..."); 
		
		
	}
		catch (Exception e) {
	         System.out.println(e);
	      } 

}}
