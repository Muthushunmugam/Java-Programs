package string;

import java.util.Scanner;

public class SpaceInString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String n = scan.nextLine();
		
		int countspace =0;
		int countletter=0;
		
		for(int i=0;i<n.length();i++){
			if(n.charAt(i) == ' ')
				countspace ++;
			if(n.charAt(i)!=' ')
				countletter ++;
		}
		
		
		System.out.println("Total spaces in the string: "+countspace);
		System.out.println("Total words in the string: "+countletter);

	}

}
