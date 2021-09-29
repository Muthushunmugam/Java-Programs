package project1;

import java.util.*;

public class Airways {

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
		
		System.out.print("Enter Age: ");
		 age1 = sc.nextInt();
		 
		 System.out.print("Gender[Male/Female]: ");
		 gender = sc.next();
		 
		listname.add(name);
	    listage.add(age1);
	   listgender.add(gender);
		 }
		
		 
	
	    System.out.println("Departure Time: ");
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
		
		
		

	}

}
