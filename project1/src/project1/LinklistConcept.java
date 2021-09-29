package project1;

import java.util.*;

public class LinklistConcept {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Ravi");
		list.add("Manu");
		list.add("Tom");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());}

	}

}
