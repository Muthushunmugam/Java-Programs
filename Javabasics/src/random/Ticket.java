package random;

import java.io.*; 
import java.util.*;

public class Ticket {
	
	private static int count = 20;
	List<String>BookingList = new ArrayList<String>();
	List<Integer>AgeList = new ArrayList<Integer>();
	List<Integer>TicketList = new ArrayList<Integer>();
	
	public void reservation() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = scan.nextLine();
		
		System.out.print("Age: ");
		int age  = scan.nextInt();
		
		System.out.print("Enter the tickets needed: ");
		int tickets = scan.nextInt();
		
		
		
		if(tickets<=count) {

				System.out.println("Booked Successfully");
				for(int i=0;i<tickets;i++) {
					BookingList.add(name);
					AgeList.add(age);
					TicketList.add(i+1);
				}
			}
		else {
			
		System.out.println("Not available");
			
		}
		
		System.out.println("Names : "+BookingList);
		System.out.println("Age : "+AgeList);
		System.out.println("Seat number : "+TicketList);
	}
	
	
	

	public static void main(String[] args) {
		
		Ticket t1 = new Ticket();
		t1.reservation();
	

	}

}
