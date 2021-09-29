package random;

import java.util.Arrays;

public class Bubblesort {
	
	void bubbleSort(int x[]) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length-i-1;j++) {
				if(x[j]>x[j+1]) {
					int temp = x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		int x[] = {-9,-11,3,0,-1,7,88,9000,7988};
		Bubblesort ref = new Bubblesort();
		
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(x));
		ref.bubbleSort(x);
		
		System.out.println("Final Array: ");
		System.out.println(Arrays.toString(x));

	}

}
