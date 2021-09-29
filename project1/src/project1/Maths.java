package project1;

public interface Maths {
	
	void calci();
	
	static int cube(int x)
	{
	 return (x*x*x);
		
	}

}


class Mat implements Maths{
	public void calci() {
		System.out.println("Cube root");
	}
}

class TestInterface2{
	public static void main(String[]args) {
		Maths ref = new Mat();
		ref.calci();
		//int a =Maths.cube(3);
		//System.out.println(a);
	}
}