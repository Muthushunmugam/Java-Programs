package array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int arr1 [] = new int[] {120,20,50,40,6};
		String arr2 [] = new String []{"C","C++","html","Java"};
		
		System.out.println("Before sorting: "+ Arrays.toString(arr1));
		System.out.println("Before sorting: "+ Arrays.toString(arr2));
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println("After sorting: "+ Arrays.toString(arr1));
		System.out.println("After sorting: "+ Arrays.toString(arr2));
		
				

	}

}
