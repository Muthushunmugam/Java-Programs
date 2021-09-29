package string;

import java.util.Scanner;

public class LengthString {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String n = scan.nextLine();
		
		System.out.println("String length: "+n.length());
		
		}

}
