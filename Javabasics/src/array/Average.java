package array;



import java.util.Scanner;

public class Average {
	
	public static void main(String args[]) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = scan.nextInt();
		System.out.println("Enter elements: ");
		int arr [] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		
		for(int a=0;a<arr.length;a++) {
			sum += arr[a];
		}
		double avg = sum/arr.length;
		
		System.out.println("Sum: "+ sum);
		System.out.println("Average: "+ avg);
	}

}

