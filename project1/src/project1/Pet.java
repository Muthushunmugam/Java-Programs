package project1;

// Super keyword used to refer immediate parent class instance variable

public class Pet {

	String color = "White";

	

}

class Mammal extends Pet{
	String color = "Black";
	
	void print() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

class TestSuper{
	public static void main(String[]args) {
		Mammal ref = new Mammal();
		ref.print();
	}
}

