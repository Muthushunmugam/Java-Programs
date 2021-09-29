package string;

import java.util.Scanner;

public class Method {
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = scan.nextLine();
		System.out.println("Enter a word: ");
		String w = scan.nextLine();
		
		int index = s.indexOf(w);
		System.out.println("Index: "+index);
	}

}
