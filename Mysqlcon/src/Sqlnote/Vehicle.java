package Sqlnote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Vehicle {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/sonoo";
	static final String USER = "root";
	static final String PASS = "Admin@123";

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Parking station");
		System.out.println(" ");
		
		
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ){
			
			 System.out.println("Inserting records into the table...");
			 System.out.println("Enter Name :");
			 String name =sc.next();
			 System.out.println("Enter Vehicle number: ");
			 String num = sc.next();
			 System.out.println("Two (or) Four wheeler: ");
			 int type = sc.nextInt();
			 System.out.println("Time parked(am/pm): ");
			 String time = sc.next();
			 
			 
	         String sql = "INSERT INTO Parking"+"(name,num,wheeler,time)"+ "VALUES ('"+name+"','"+num+"','"+type+"','"+time+"')";
	         stmt.executeUpdate(sql);  
	         
	       
	         
	         System.out.println("Inserted records into the table..."); 
		
		
	}
		catch (Exception e) {
	         System.out.println(e);
	      } 
	}

}
