package project1;

import java.util.*;

public class StackConcept {

	public static void main(String[] args) {
		
		Stack <String>stack = new Stack<String>();
		
		stack.push("Raja");
		stack.push("Ram");
		stack.push("Ravi");
		stack.pop();
		

		Iterator <String>itr = stack.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());}
		

	}

}
