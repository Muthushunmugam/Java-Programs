package random;


import java.util.Scanner;

public class VoteCons {
	

	VoteCons(int age) {
		
		
		if(age >18) {
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("Not eligible");
		}
		
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		VoteCons ref = new VoteCons(age);
	}

}
