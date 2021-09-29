package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ListConcept1 {

	public static void main(String[] args) {
		
		int size = 4;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter "+size+ " names: ");
		String arr[] = new String [size];
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=scan.next();
		}
		
		System.out.println(Arrays.toString(arr));
		
        ArrayList<String> list = new ArrayList<String>();
		
        System.out.println("Enter the name 1: ");
        String name = scan.next();
        list.add(name);
        
		list.add("Ravi");
		list.add("Mani");
		list.add("Tom");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());}

	}

}
