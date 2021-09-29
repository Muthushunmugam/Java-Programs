package random;

import java.util.Scanner;

public class PalindromeNumber {


	public static void main(String[] args) {
		
		
		System.out.println("Enter a number to check if it is a palindrome or not: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp,rem,sum=0;
		
		temp = n;
		
		while(n>0) {
			rem = n%10;
			sum = (sum*10) + rem;
			n=n/10;
		}
		
		if(temp==sum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		

	}

}
