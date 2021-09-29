package string;

import java.util.Scanner;

public class StringFind1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String n = scan.nextLine();
		
		int index = n.indexOf("is");
		System.out.println("Index at which 'is' appears:"+index );

	}

}
