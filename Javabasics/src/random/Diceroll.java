package random;

import java.util.Random;

public class Diceroll {
	
	Random rand;
	int num;
	Diceroll()
	{
		rand = new Random();
		roll();
		
		
	}
	private void roll() {
		num=rand.nextInt(6);
		System.out.println(num);
		
	}
	
	public static void main(String[]args) {
		Diceroll obj = new Diceroll();
	}

}
