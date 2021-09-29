package array;

import java.util.Arrays;

public class PositiveNegative {

	public static void main(String[] args) {
		
		int arr [] = new int [] {-1,4,7,8,3,-2,-74,0};
		System.out.println("Array: "+Arrays.toString(arr));
		int j,temp;
		for(int i=0;i<arr.length;i++) {
			j=i;
			
			while((j > 0) && (arr[j] >0) && (arr[j-1] < 0)) {
				 temp = arr[j];
				 arr[j]=arr[j-1];
				 arr[j-1]=temp;
				 j--;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		

}}
