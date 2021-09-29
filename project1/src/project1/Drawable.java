package project1;


import project1.Drawable;


/* We can create objects for interface instead of creating objects for 
 classes. We can create empty methods in interface and should be reused
 in classes. 
 
 Interface variables are public,static,final
 
 Interface method must be override in upcoming classes
 
 Interface method can not be protected or final
 
 Final keyword should not be used in the interface
 
 Constant methods, Abstract methods, Static methods , default methods
 are allowed in the interface
 
 public method is used inside the classes that we are calling for interface
 
 
 */

public interface Drawable {
	
	void draw();

}

class Rectangle implements Drawable{
	
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle implements Drawable{
	
	public void draw() {
		System.out.println("Drawing circle");
	}
}

class TestInterface{
	
	public static void main(String args[]) {
		Drawable ref = new Rectangle();
		ref.draw();
		Drawable ref1 = new Circle();
		ref1.draw();
		
	}
}