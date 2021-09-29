package random;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to check palindrome: ");
		String n = scan.next();
		
		int n1 = n.length();
		String reverse = "";
		
		for(int i = n1-1;i>=0;--i) {
			reverse = reverse + n.charAt(i);
		}
		
		
		if(n.toLowerCase().equals(reverse.toLowerCase())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
