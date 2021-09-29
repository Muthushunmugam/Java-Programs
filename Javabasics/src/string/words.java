package string;

import java.util.Scanner;

public class words {
	
	
	public static void main(String [] args) {
		
		int count = 0;
		String s;
		char letter;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		 s = scan.nextLine();
		
		System.out.println("Enter a letter to find : ");
		 letter = scan.next().charAt(0);
			
        for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == letter) {
				count++;
			}
			
	}
        System.out.println("Number of times repeated: "+ count);

}}

