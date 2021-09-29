package string;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "RAM";
		String str2 = str1.toUpperCase();
		
		if(str1==str2) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println((str1.hashCode()));
		System.out.println(Integer.toHexString(str2.hashCode()));
		

	}

}
