package project2;

import java.util.Scanner;

import project1.Package;

public class Pack_age {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int agee = sc.nextInt();
		
		Package ref = new Package();
		ref.Fun(agee);
	}

}
