package random;

import java.util.Scanner;

public class Booking {
	
	public static void main(String[]args) {
		
		System.out.print("Total seats = 20");
		System.out.print("\nTotal seats available = 15");
		System.out.println("\nEnter number of seats: ");
		Scanner scanner =new Scanner(System.in);
		int n= scanner.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Select seat number[1 to 20]: ");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
	
	
	int [] arr1 = new int [] {2,3,5,12,20};
	
	for(int a=0;a<arr.length;a++)
	{for(int b=0;b<arr1.length;b++) {
		if (arr[a] !=arr1[b]) {
			continue;
			
		}
		else {
			System.out.println("Already booked");
			System.out.println("2,3,5,12,20-Already reserved");
		    System.out.print("\nEnter number of seats: ");
			int no3 = scanner.nextInt();
			int arr4[]=new int[no3];
			System.out.println("Select seat number: ");
			for(int i4=0;i4<no3;i4++) {
				arr4[i4]=scanner.nextInt();
			}
			System.out.println("Reserved successsfully");}
		}
			
		}
	}
}

