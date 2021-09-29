package pack;

import java.util.Scanner;

public class Vehicle {
	
	
	public void type1() {
		
		
		String num;
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter registration number");
		num = scan.nextLine();
		System.out.println("Reg No: "+num);
		
	}
	
	public void type2() {
		
		int type;
		Scanner scan = new Scanner(System.in);
		System.out.println("Two or Four wheeler");
		type = scan.nextInt();
		System.out.println(type+" wheeler");
		
	}	
		
}
class Subclass extends Vehicle {
	
	
	
	public void year() {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year of purchase: ");
		int year = sc.nextInt();
		 age = 2021 - year;
		
		System.out.println("Years old = "+age);	
	}
	
}


class MainCall{
public static void main(String[] args) {
	
	Subclass ref = new Subclass();
	ref.year();
	
	//Superclass calling using subclass
	
	Vehicle obj = (Vehicle)ref;
	obj.type1();
	obj.type2();
	
	

	
	}
}
