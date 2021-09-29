package random;

import java.util.Scanner;
public class Arr {
	public static void main(String[]args) {
		
		System.out.print("Enter size: ");
		Scanner scanner =new Scanner(System.in);
		int n= scanner.nextInt();
		int [] arr=new int[n]; 
		System.out.println("Insert elements in the array: ");
		for(int i=0;i<n;i++) {
			arr[i]= scanner.nextInt();
			
			
		}
		scanner.close();
		/*
		for(int a:arr) {
			System.out.println(a);
		}*/
		
		for(int a=0;a<arr.length;a++) {
			for(int b=a+1;b<arr.length;b++) {
				if(arr[a]>arr[b]) {
					int temp = arr[a];
					arr[a] = arr[b];
					arr[b] = temp;
					
					
				}
			}
		}
		
		System.out.println(arr[(arr.length)-1]);
		System.out.println(arr[0]);
	}

}
