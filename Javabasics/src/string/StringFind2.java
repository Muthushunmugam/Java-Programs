package string;
import java.util.Scanner;
import javax.swing.text.AttributeSet.CharacterAttribute;
public class StringFind2 {

	public static void main(String[] args) {
		
		char name = ' ';
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String n = scan.nextLine();
		System.out.println("Enter the Index value: ");
		int num = scan.nextInt();
		
		for (int i = 0; i < n.length(); i++) {
			
			name = n.charAt(num);
			
		} 
		
		System.out.println("The word at index "+num+" is "+name);
		

	}

}
