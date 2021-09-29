package random;

import java.util.Scanner;

public class Birthdate {
	
	int day,month,year;
	
	public void date()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Date: ");
		day = scan.nextInt();
		System.out.println("Enter Month: ");
		month = scan.nextInt();
		System.out.println("Enter Year: ");
		year = scan.nextInt();}
		
	public String toString() {
			return ("-Birthday: "+day+"."+month+"."+year);
		}
		
		
	}

class FullName{
	String details;
	Birthdate d= new Birthdate();
	
	public void name()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		details = sc.nextLine();
		d.date();
		details = details+d;
		
			
	}
	
	public String toString() {
		return details;
	}
}

class MainMethod{
	
	public static void main(String[]args) {
		
		FullName obj = new FullName();
	
		obj.name();
		
		System.out.println(obj);
	}
}
