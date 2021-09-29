package array;

import java.util.Arrays;

public class AddIndex {

	public static void main(String[] args) {
		
		int arr[]= new int[] {1,2,6,7,84,32};
		System.out.println("Array: "+Arrays.toString(arr));
		
		int index=2,value=3;
		
       /*for(int j = index;j<arr.length -1 ;j++) {
    	   arr[j]=arr[j+1];
       }*/
       arr[index]=value;
       System.out.println("New array: "+Arrays.toString(arr));
       
	}

}
