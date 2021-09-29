package array;

import java.util.Scanner;

public class adding {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		System.out.print("Enter x: ");
		int x=scan.nextInt();
		System.out.print("Enter y: ");
		int y=scan.nextInt();
		while(y != 0){
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.print("Sum: "+x); 
		System.out.print("\n");    
		
		
		
		
	}
}
