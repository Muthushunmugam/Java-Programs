package project1;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ListConcept {
	
	

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Mani");
		list.add("Tom");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());}
		
		
		

	}

}
