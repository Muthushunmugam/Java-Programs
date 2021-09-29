package project1;

import java.util.Scanner;

public class Dishes {
	
	public void Option1() {
		
		System.out.println("OPTION 1-Vegan Combo - rs.450");
		System.out.println(" ");
		System.out.println("Veg pizza small");
		System.out.println("Paneer Burger");
		System.out.println("Nuggets (5 pieces)");
		System.out.println("Vannila Milkshake + Coke(small)");
		System.out.println(" ");
		
	}
	
	public void Option2() {
		
		System.out.println("OPTION 2-Chicken Combo - rs.650");
		System.out.println(" ");
		System.out.println("Chicken pizza small");
		System.out.println("Mexican cheese Burger");
		System.out.println("Chicken Cutlet (5 pieces)");
		System.out.println("Butterscotch Milkshake + Coke(Large)");
		System.out.println(" ");
	}
	
   public void Option3() {
		
	    System.out.println(" ");
	    System.out.println("OPTION 3- Pizza Combo - rs.750");
	    System.out.println(" ");
	    System.out.println("Pizza Large Non veg Large");
		System.out.println("Pizza Large Paneer Medium");
		System.out.println("Coke");
		System.out.println(" ");
	}
	
	}


class Starters{
	
    public void Starters1() {
		
    	System.out.println("STARTERS");
    	System.out.println(" ");
		System.out.println("Ice cream - rs 100");
		System.out.println("All Flavours available");
		System.out.println(" ");
	}
	
     public void Starters2() {
		
    	System.out.println(" ");
		System.out.println("Crisps - rs 200");
		System.out.println("[French Fries]");
		System.out.println("[Smileys]");
		System.out.println(" ");
	}
	
}
	

class Testclass{
	public static void main(String[] args) {
		
		int amount=0;
		
		System.out.println("MC DONALDS - Menu");
		System.out.println(" ");
		
		Dishes ref = new Dishes();
		ref.Option1();
		ref.Option2();
		ref.Option3();
		
		Starters ref1 = new Starters();
		ref1.Starters1();
		ref1.Starters2();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select any one option : ");
		int option = sc.nextInt();
		switch(option) {
		case 1:
		{
			amount = amount + 450;
			break;
		}
		case 2:
		{
			amount = amount + 650;
			break;
		}
		case 3:
		{
			amount = amount + 750;
			break;
		}
		default:
			System.out.println("Invalid option");
			
		}
		
		System.out.println("Do you want starters ? (y/n)");
		char ch = sc.next().charAt(0);
		
		if(ch == 'y'||ch == 'Y') {
			
			System.out.println("Starters option 1 (or) 2: ");
			
			int st = sc.nextInt();
			
			if(st == 1) {
				amount = amount+100;
			}
			
			if(st == 2) {
				amount = amount+200;
			}
		}
		
		else {
			System.out.println("Thank you");
		}
		
		System.out.println("BILL: "+amount);

	}}


