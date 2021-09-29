package string;

import java.util.Arrays;

public class ByteConversion {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hello how are you";
		byte by [] = s1.getBytes();
		
		System.out.println(Arrays.toString(by));
		
		
		 s1.getBytes(4, 10, by, 0);
		
		System.out.println((Arrays.toString(by)));

	}

}

