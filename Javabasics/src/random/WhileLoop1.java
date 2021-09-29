package random;


import java.util.Scanner;

public class WhileLoop1 {
	
	
	public static void main(String[]args) {
		
		System.out.print("Total seats = 20");
		System.out.print("\nTotal seats available = 15");
		System.out.println("\nEnter number of seats: ");
		Scanner scanner =new Scanner(System.in);
		int n= scanner.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Select seat number: ");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		
		for(int a=0;a<arr.length;a++) 
		{
			if(arr[a]==4) {
					System.out.println("4,7,8,15,20-Already reserved");
					System.out.print("\nEnter number of seats: ");
					int no = scanner.nextInt();
					int arr1[]=new int[no];
					System.out.println("Select seat number: ");
					for(int i1=0;i1<no;i1++) {
						arr1[i1]=scanner.nextInt();
					}
					System.out.println("Reserved successsfully");}
			if(arr[a]==7) {
				System.out.println("4,7,8,15,20-Already reserved");
				System.out.print("\nEnter number of seats: ");
				int no1 = scanner.nextInt();
				int arr2[]=new int[no1];
				System.out.println("Select seat number: ");
				for(int i2=0;i2<no1;i2++) {
					arr2[i2]=scanner.nextInt();
				}
				System.out.println("Reserved successsfully");
				}
			if(arr[a]==15) {
				System.out.println("4,7,8,15,20-Already reserved");
				System.out.print("\nEnter number of seats: ");
				int no2 = scanner.nextInt();
				int arr3[]=new int[no2];
				System.out.println("Select seat number: ");
				for(int i3=0;i3<no2;i3++) {
					arr3[i3]=scanner.nextInt();
				}
				System.out.println("Reserved successsfully");}
			if(arr[a]==8) {
			    System.out.println("4,7,8,15,20-Already reserved");
			    System.out.print("\nEnter number of seats: ");
				int no3 = scanner.nextInt();
				int arr4[]=new int[no3];
				System.out.println("Select seat number: ");
				for(int i4=0;i4<no3;i4++) {
					arr4[i4]=scanner.nextInt();
				}
				System.out.println("Reserved successsfully");}
			if(arr[a]==20) {
			    System.out.println("4,7,8,15,20-Already reserved");
			    System.out.print("\nEnter number of seats: ");
				int no4 = scanner.nextInt();
				int arr5[]=new int[no4];
				System.out.println("Select seat number: ");
				for(int i5=0;i5<no4;i5++) {
					arr5[i5]=scanner.nextInt();
				}
				System.out.println("Reserved successsfully");
			
				
			}
			if(arr[a]==1) {
				System.out.println("Seat 1 -Reserved successfully");
			}
			if(arr[a]==2) {
				System.out.println("Seat 2 -Reserved successfully");
			}
			if(arr[a]==3) {
				System.out.println("Seat 3 -Reserved successfully");
			}
			if(arr[a]==5) {
				System.out.println("Seat 5 -Reserved successfully");
			}
			if(arr[a]==6) {
				System.out.println("Seat 6 -Reserved successfully");
			}
			if(arr[a]==9) {
				System.out.println("Seat 9 -Reserved successfully");
			}
			if(arr[a]==10) {
				System.out.println("Seat 10 -Reserved successfully");
			}
			if(arr[a]==11) {
				System.out.println("Seat 11 -Reserved successfully");
			}
			if(arr[a]==12) {
				System.out.println("Seat 12 -Reserved successfully");
			}
			if(arr[a]==13) {
				System.out.println("Seat 13 -Reserved successfully");
			}
			if(arr[a]==14) {
				System.out.println("Seat 14 -Reserved successfully");
			}
			if(arr[a]==16) {
				System.out.println("Seat 16 -Reserved successfully");
			}
			if(arr[a]==17) {
				System.out.println("Seat 17 -Reserved successfully");
			}
			if(arr[a]==18) {
				System.out.println("Seat 18 -Reserved successfully");
			}
			if(arr[a]==19) {
				System.out.println("Seat 19 -Reserved successfully");
			}
			
			
		    
		    
		}
		
		
		
		
		
		
		}
		
		/*
		  String name ="";
		while(name.equals(""))
		{
			System.out.println("Enter name:");
			name = scanner.nextLine();
		}
		 */	

}

