package project1;

import java.util.Scanner;

 interface client {
	
	void input();
	void output();

}

class Raju implements client{
	
	String name;double sal;
	
	Scanner sc = new Scanner(System.in);
	public void input() {
		
		System.out.println("Enter the name: ");
		name = sc.next();
		System.out.println("Enter salary: ");
		sal = sc.nextDouble();
		
		
	}
	
	public void output() {
		System.out.println("Name: "+name);
		System.out.println("Salary: "+sal);
	}
}

class TestIn{
	public static void main(String[]args) {
		client ref = new Raju();
		ref.input();
		ref.output();
	}
}