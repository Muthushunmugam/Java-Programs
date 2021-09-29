package Sqlnote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Ticket {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/sonoo";
	static final String USER = "root";
	static final String PASS = "Admin@123";

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("LUFTHANSA AIRWAYS");
		System.out.println("Welcome to Lufthansa!");
		System.out.println(" ");
		System.out.println("Ticket Reservation - USA[Washington DC]");
		
		System.out.println("Enter name: ");
		String nam = sc.next();
		
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		if(age <= 18) {
			System.out.println("Not eligible");
			System.exit(0);
		}
		System.out.println("5 Tickets available");
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ){
			
			 System.out.println("Inserting records into the table...");
			 System.out.println("Enter Name(1) :");
			 String name1 =sc.next();
			 
			 System.out.println("Enter age(1): ");
			 int age1 = sc.nextInt();
			 
			 System.out.print("Gender[Male/Female](1): ");
			 String gender1 = sc.next();
			 
			 System.out.println("Enter Name(2) :");
			 String name2 =sc.next();
			 
			 System.out.println("Enter age(2): ");
			 int age2 = sc.nextInt();
			 
			 System.out.print("Gender[Male/Female](2): ");
			 String gender2 = sc.next();
			 
			 System.out.println("Enter Name(3) :");
			 String name3 =sc.next();
			 
			 System.out.println("Enter age(3): ");
			 int age3 = sc.nextInt();
			 
			 System.out.print("Gender[Male/Female](3): ");
			 String gender3 = sc.next();
			 
			 System.out.println("Enter Name(4) :");
			 String name4 =sc.next();
			 
			 System.out.println("Enter age(4): ");
			 int age4 = sc.nextInt();
			 
			 System.out.print("Gender[Male/Female](4): ");
			 String gender4 = sc.next();
			 
			 System.out.println("Departure Time: ");
			    String depart = sc.next();
			    
			 System.out.print("Arrival Time: ");
			    String arrival = sc.next();
			    
			 System.out.println("Details : Person 1");
			 System.out.println("Name: "+name1+"\nAge: "+age1+"\nGender: "+gender1);
			 System.out.println("Details : Person 2");
			 System.out.println("Name: "+name2+"\nAge: "+age2+"\nGender: "+gender2);
			 System.out.println("Details : Person 3");
			 System.out.println("Name: "+name3+"\nAge: "+age3+"\nGender: "+gender3);
			 System.out.println("Details : Person 4");
			 System.out.println("Name: "+name4+"\nAge: "+age4+"\nGender: "+gender4);
			 System.out.println("Departure: "+depart);
			 System.out.println("Arrival: "+arrival);
			 
			  System.out.println("Tickets booked! ");
			 
			 
			 
	         String sql1 = "INSERT INTO pass"+"(name,age,gender,dept,arrival)"+ "VALUES ('"+name1+"','"+age1+"','"+gender1+"','"+depart+"','"+arrival+"')";
	         stmt.executeUpdate(sql1);  
	         String sql2 = "INSERT INTO pass"+"(name,age,gender,dept,arrival)"+ "VALUES ('"+name2+"','"+age2+"','"+gender2+"','"+depart+"','"+arrival+"')";
	         stmt.executeUpdate(sql2);
	         String sql3 = "INSERT INTO pass"+"(name,age,gender,dept,arrival)"+ "VALUES ('"+name3+"','"+age3+"','"+gender3+"','"+depart+"','"+arrival+"')";
	         stmt.executeUpdate(sql3);
	         String sql4 = "INSERT INTO pass"+"(name,age,gender,dept,arrival)"+ "VALUES ('"+name4+"','"+age4+"','"+gender4+"','"+depart+"','"+arrival+"')";
	         stmt.executeUpdate(sql4);
	       
	         
	         System.out.println("Inserted records into the table..."); 
		
		
	}
		catch (Exception e) {
	         System.out.println(e);
	      } 
		
		
		
		
	}

}
