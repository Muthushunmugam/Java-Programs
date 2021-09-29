package project1;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Automated teller Machine");
		int balance = 20000;
		int PIN = 3333;
		
		
		int amount=balance;
		System.out.println("Select 1 for Withdrawal");
		System.out.println("Select 2 for Deposit");
		System.out.println("Select 3 for Balance");
		System.out.println("Select 4 for PIN change");
		System.out.println("Select 5 for Exit");
		
		System.out.println("Enter PIN number: ");
		int enter = sc.nextInt();
		
		if(enter == PIN) {
		
		while(true) {
		System.out.println("Enter your Choice: ");
		int option = sc.nextInt();
		
		switch(option) {
		
		case 1:
			
			System.out.println("Enter the Amount: ");
			int wd = sc.nextInt();
			
			if(wd>amount) {
				System.out.println("Insufficient Balance");
			}
			else {
				
			 amount = amount - wd;
			
			System.out.println("Amount withdrawn = "+wd);
			System.out.println("Balance Amount = "+amount);}
			
			System.out.println("Do you want to continue: (y/n)");
			char decision = sc.next().charAt(0);
			
			if((decision == 'y')||(decision == 'Y')) {
				continue;
			}
			else if((decision == 'n')||(decision == 'N'))
			{
				System.exit(0);
			}
			else {
				System.exit(0);
			}
			break;
			
		case 2:
			
			System.out.println("Enter the Amount: ");
			int de = sc.nextInt();
			 amount = amount + de;
			
			System.out.println("Amount Deposited = "+de);
			System.out.println("Balance Amount = "+amount);
			
			System.out.println("Do you want to continue: (y/n)");
			char decision1 = sc.next().charAt(0);
			
			if((decision1 == 'y')||(decision1 == 'Y')) {
				continue;
			}
			else if((decision1 == 'n')||(decision1 == 'N'))
			{
				System.exit(0);
			}
			else {
				System.exit(0);
			}
			
			
			break;
			
		case 3:
			
			System.out.println("Balance amount = "+amount );
			System.out.println("Do you want to continue: (y/n)");
			char decision2 = sc.next().charAt(0);
			
			if((decision2 == 'y')||(decision2 == 'Y')) {
				continue;
			}
			else if((decision2 == 'n')||(decision2 == 'N'))
			{
				System.exit(0);
			}
			else {
				System.exit(0);
			}
			break;
			
		case 4:
			
			
			System.out.println("Enter your Current PIN: ");
			int oldPIN = sc.nextInt();
			if(oldPIN == PIN) {
				System.out.println("Enter new PIN: ");
				int newPIN = sc.nextInt();
				PIN = newPIN;
				System.out.println("Your PIN = "+ PIN);
				
			}
			else {
				System.out.println("INVALID PIN");
			}
			
			System.out.println("Do you want to continue: (y/n)");
			char decision3 = sc.next().charAt(0);
			
			if((decision3 == 'y')||(decision3 == 'Y')) {
				continue;
			}
			else if((decision3 == 'n')||(decision3 == 'N'))
			{
				System.exit(0);
			}
			else {
				System.exit(0);
			}
			
		case 5:
			
			System.exit(0);
			break;
		
		
		default:
			System.out.println("Invalid operation");

	}
	}}
		else{
			System.out.println("Wrong pin");}
		}
}
