package string;

import java.util.Scanner;

public class Occur {
	
	public static void main(String [] args)
	{
		String n1;
		char ch;
		int times = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		 n1 = scan.nextLine();
		 
		 System.out.println("Enter a Character: ");
		 ch = scan.next().charAt(0);
		 
		 for (int i = 0; i < n1.length(); i++) {
				
				if(n1.charAt(i) == ch) {
					times++;
					
					//System.out.println(times);
					System.out.println("The letter "+ch+" occurs at "+i+"th "+" position");
				}		
		
	}
		 System.out.println("Total times repeated:"+times);

}}
