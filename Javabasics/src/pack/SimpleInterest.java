package pack;

//Method Overriding

import java.util.Scanner;

public class SimpleInterest {
	
	 void details(double p ,double n ,double r) {
		
		double si = (p*n*r)/100.00;
		System.out.println("Simple Interest: "+ si);
		
	}

}

class Info extends SimpleInterest{
	
	void details(String name,String Bankname) {
		
		System.out.println("Name "+name);
		System.out.println("Bank "+Bankname);
	}
}

class DataMain{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String n1 = sc.nextLine();
		String n2 = sc.nextLine();
		double pri = sc.nextDouble();
		double yrs = sc.nextDouble();
		double rate = sc.nextDouble();
		
		SimpleInterest ref = new SimpleInterest();
		ref.details(pri, yrs, rate);
		
		Info obj = new Info();
		obj.details(n1, n2);
		
	}
}
