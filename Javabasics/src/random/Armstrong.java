package random;


import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		
		System.out.println("Enter a 3 digit number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp,rem,result = 0;
		 temp = n;
		
		for( ;temp!=0;temp /= 10) {
			rem = temp %10;
			result = result + rem*rem*rem;
		}
		
		if(result == n) {
			System.out.println(n+ " is an armstrong number");
		}
		else {
			System.out.println(n+ " is not an armstrong number");
		}
	}

}
