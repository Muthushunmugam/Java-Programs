package Sqlnote;

import java.sql.*; 
import java.util.*;

public class Airways1 {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/sonoo";
	static final String USER = "root";
	static final String PASS = "Admin@123";

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String gender="";
		String name ="";
		String depart="",arrival="";
		int age1=0;
		int output;
		
		
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
		
		
		int i;
		String namearr[]= new String[tickets];
		int agearr[]=new int[tickets];
		String genarr[]= new String[tickets];
		String deparr[]= new String[tickets];
		String arrivarr[]= new String[tickets];
			
			 //System.out.println("Inserting records into the table...");
			
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ){
			
			for( i=0;i<namearr.length;i++) {
			
			 System.out.println("Enter Names : ");
			 namearr[i] =sc.next();}
			
			for( i=0;i<agearr.length;i++) {
				
				System.out.println("Age : ");
				 agearr[i] = sc.nextInt();}
			
             for( i=0;i<genarr.length;i++) {
				
            	 System.out.println("Gender : ");
    			 genarr[i] = sc.next();}
             
             for( i=0;i<deparr.length;i++) {
 				
 				System.out.println("Depart : ");
 				 deparr[i] = sc.next();}
 			
              for( i=0;i<arrivarr.length;i++) {
 				
             	 System.out.println("Arrival : ");
             	arrivarr[i] = sc.next();}
             
			
			 System.out.println(" ");
			 System.out.println("Details: ");
			 System.out.println(" ");
			 
			 for(i=0;i<tickets;i++) {
				 
				 System.out.println("Name: "+namearr[i]);
				 
			 }
             for(i=0;i<tickets;i++) {
				 
				 System.out.println("Age : "+agearr[i]);
				 
			 }
             for(i=0;i<tickets;i++) {
				 
				 System.out.println("Gender: "+genarr[i]);
				 
			 }
             for(i=0;i<tickets;i++) {
				 
				 System.out.println("Depart time : "+deparr[i]);
				 
			 }
             for(i=0;i<tickets;i++) {
				 
				 System.out.println("Arrival time : "+arrivarr[i]);
				 
			 }
			 
			 System.out.println();
			
			 System.out.println("Happy Journey!");
			
			System.out.println(" ");
			 
			for( i=0;i<namearr.length;i++) {
	         String sql = "INSERT INTO Travel"+ "(name)" +" VALUES ('"+namearr[i]+"') ";
	         stmt.executeUpdate(sql);  }
			
			for( i=0;i<agearr.length;i++) {
		         String sql = "INSERT INTO Travel"+ "(age)" +" VALUES ('"+agearr[i]+"') ";
		         stmt.executeUpdate(sql);  }
			
			for( i=0;i<genarr.length;i++) {
		         String sql = "INSERT INTO Travel"+ "(gender)"+ "VALUES ('"+genarr[i]+"') ";
		         stmt.executeUpdate(sql);  }
			
			for( i=0;i<deparr.length;i++) {
		         String sql = "INSERT INTO Travel"+ "(Dept)"+ "VALUES ('"+deparr[i]+"')";
		         stmt.executeUpdate(sql);  }
			
			for( i=0;i<arrivarr.length;i++) {
		         String sql = "INSERT INTO Travel"+"(Arrival)"+" VALUES ('"+arrivarr[i]+"') ";
		         stmt.executeUpdate(sql);  }
	         
	       
	         
	         System.out.println("Inserted records into the table..."); 
		
		
	}
		catch (Exception e) {
	         System.out.println(e);
	      } 

		
		
		

	}

}