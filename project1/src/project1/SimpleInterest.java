package project1;

import java.util.Scanner;



public class SimpleInterest {
	
        public void details(double p ,double n ,double r) {
		
		double si = (p*n*r)/100.00;
		System.out.println("Simple Interest: "+ si);
		
	}

}

class Info extends SimpleInterest{
	
	public void details(String name,String Bankname) {
		
		System.out.println("Name: "+name);
		System.out.println("Bank: "+Bankname);
	}
}

class DataMain{
	public static void main(String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String n1 = sc.nextLine();
		System.out.println("Bank name: ");
		String n2 = sc.nextLine();
		System.out.println("Principal amount: ");
		double pri = sc.nextDouble();
		System.out.println("Years: ");
		double yrs = sc.nextDouble();
		System.out.println("rate of Interest: ");
		double rate = sc.nextDouble();
		
		SimpleInterest ref = new SimpleInterest();
		ref.details(pri,yrs,rate);
		
		Info obj = new Info();
		obj.details(n1,n2);
		
	}
}
