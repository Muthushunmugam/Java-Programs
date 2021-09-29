package random;

public class St{
	
	String name;
	
	St(){
		System.out.println("Unknown");
		
	}
	St(String n){
		name = n;
		System.out.println(n);
		
		String str = name.replaceFirst("Ram", "Shiva");
		System.out.println(str);
		
	}

}

class Call{
	public static void main(String[]args) {
		
		//String name = "Ram kumar";
	St nam = new St();
	St nam1 = new St("Ram kumar");}
}
