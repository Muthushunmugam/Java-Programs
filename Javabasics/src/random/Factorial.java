package random;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String args[]) {
		int i,fact=1;
		System.out.print("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is "+ fact);
		
		
		
	}

}
