package project1;

public class Dimple {

	 Dimple() {
		System.out.println("Created");
	}

}

class Dog extends Dimple{
	Dog(){
		super();
		System.out.println("Dog");
	}
}

class TestSuper3{
	public static void main(String [] args) {
		Dog d = new Dog();
	}
}
