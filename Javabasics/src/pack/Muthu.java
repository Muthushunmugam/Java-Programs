package pack;

//Method Overriding

public class Muthu {
	void show()
	{
		System.out.println("car is running");
	}

}

class Car2 extends Muthu{
	void show()
	{
		System.out.println("Audi car is running");
	}
	
}

class Muthus{
	public  static void main(String[] args)
{
	Muthu au=new Muthu();
	au.show();
	
	Car2 obj=new Car2();
	obj.show();
}
}
