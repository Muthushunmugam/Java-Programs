package project1;

//Super keyword used to invoke parent class method


public class Kite {
	
	void eat() {
		System.out.println("Eating");
	}

}


class Dig extends Kite{
	
	void eat()
	{
		System.out.println("Eating Bread");
	}
	void sleep()
	{
		System.out.println("Sleeping");
	}
	
	void work()
	{
		sleep();
		eat();
		super.eat();
	}
}


class Testsuper1{
	public static void main(String [] args) {
		Dig ref = new Dig();
		ref.work();
	}
}