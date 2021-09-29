package Sqlnote;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public class Airways2 {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/sonoo";
	static final String USER = "root";
	static final String PASS = "Admin@123";

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listname = new ArrayList<String>();
		List<Integer> listage = new ArrayList<Integer>();
		ArrayList<String> listgender = new ArrayList<String>();
		
		String gender="", name ="" ;
		double depart=0,arrival=0;
		int age1=0;
		
		System.out.println("JET AIRWAYS");
		System.out.println("Welcome to Jet Airways!");
		System.out.println(" ");
		
		System.out.println("Ticket Reservation for Coimbatore to Singapore");
		System.out.println(" ");
		System.out.print("Enter your name: ");
		String name1 = sc.next();
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if(age <= 18) {
			System.out.println("Not eligible");
			System.exit(0);
		}
		
		System.out.print("How many tickets you need: ");
		int tickets = sc.nextInt();
		
		for (int i=0;i<tickets;i++)
		
		 {
		
		System.out.print("Enter name: ");
		 name = sc.next();
		// sc.next();
		
		System.out.print("Enter Age: ");
		 age1 = sc.nextInt();
		 
		 System.out.print("Gender[Male/Female]: ");
		 gender = sc.next();
		 
		 listname.add(name);
		 listage.add(age1);
		 listgender.add(gender);
		 
		 
		 }
		
		System.out.print("Departure Time: ");
		 depart = sc.nextDouble();
		
		System.out.print("Arrival Time: ");
		 arrival = sc.nextDouble();
		
		 System.out.println("Booked Successfully");
			System.out.println(" ");
			
			System.out.println("Details: ");
			System.out.println(" ");
			
			Iterator itr = listname.iterator();
			while(itr.hasNext()) {
			System.out.println("Name: "+ itr.next());}
			
			Iterator itr1 = listage.iterator();
			while(itr1.hasNext()) {
			System.out.println("Age: "+itr1.next());}
			
			Iterator itr2 = listgender.iterator();
			while(itr2.hasNext()) {
			System.out.println("Gender: "+itr2.next());}
		 
		
	
		System.out.println("Departure Time: "+depart);
		System.out.println("Arrival Time: "+arrival);
		System.out.println("Happy Journey!");
		
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ){
			
			 System.out.println("Inserting records into the table...");
			 System.out.println("Name please: ");
			 String new1 =sc.next();
			 System.out.println("Age please: ");
			 int ag = sc.nextInt();
			 System.out.println("Gender please: ");
			 String new2 = sc.next();
			 
	         String sql = "INSERT INTO Airways"+"(name,age,gender)"+ "VALUES ('"+new1+"','"+ag+"','"+new2+"')";
	         stmt.executeUpdate(sql);  
	         
	       
	         
	         System.out.println("Inserted records into the table..."); 
		
		
	}
		catch (Exception e) {
	         System.out.println(e);
	      } 

		
		
		

	}}

