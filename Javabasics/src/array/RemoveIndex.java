package array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveIndex {
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = scan.nextInt();
		System.out.println("Enter elements: ");
		int arr [] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the index value to remove: ");
		int index = scan.nextInt();
		
		for(int j = index;j<arr.length -1 ;j++) {
			
			arr[j]=arr[j+1];
			
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
