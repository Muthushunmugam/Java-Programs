package pack;

public class OverLoad {
	
	public void getInt(int i) {
		
		System.out.println(i);
	}
	
    public void getfloat(float f) {
		
		System.out.println(f);
	}
    
    
	

	public static void main(String[] args) {
		
		OverLoad ref = new OverLoad();
		ref.getInt('A');
		ref.getInt(5000);
		ref.getfloat((float)3.14); //Explicit Type casting

	}

}
