package random;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		char operator;
		double num1,num2,x;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter operators +,-,*,/: ");
		operator = scan.next().charAt(0);
		
		System.out.print("Enter First number: ");
		num1 = scan.nextDouble();
		
		System.out.print("Enter Second number: ");
		num2 = scan.nextDouble();
		
		switch(operator) {
		case '+':
			
			 x= num1 + num2;
			System.out.println(num1 + " + " + num2 +" = " + x);
			break;
		
	    case '-':
		
		     x= num1 - num2;
		     System.out.println(num1 + " - " + num2 +" = " + x);
		     break;
		
         case '*':
			
			x= num1 * num2;
			System.out.println(num1 + " * " + num2 +" = " + x);
			break;
		
	    case '/':
		
		     x= num1 / num2;
		     System.out.println(num1 + " / " + num2 +" = " + x);
		     break;
		
		default:
			System.out.println("INVALID");
	
		
		}
	}

}
