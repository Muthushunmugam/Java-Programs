package project1;

public class Pet1 {

	String color = "White";
	
	void newmethod() {
		System.out.println("Print");
	}

}
class Mammal1 extends Pet1{
	String color = "Black";
	
	void print() {
		super.newmethod();
		System.out.println(color);
		System.out.println(super.color);
	}
}

class TestSuper4{
	public static void main(String[]args) {
		Mammal1 ref = new Mammal1();
		ref.print();
	}
}
