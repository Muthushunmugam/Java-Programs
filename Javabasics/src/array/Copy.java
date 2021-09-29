package array;

import java.util.Arrays;

public class Copy {
	public static void main(String[]args) {
		int arr1[]= new int[] {1,2,6,7};
		int arr2[]= new int[4];
		System.out.println("Existing array: "+Arrays.toString(arr1));
		
		for(int i=0;i<arr1.length;i++) {
			
			arr2[i]=arr1[i];
		}
		
		System.out.println("New array: "+Arrays.toString(arr1));
		

}}
