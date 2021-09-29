package pack;

import java.util.Scanner;

public class Characters {
	
	public void print() {
		
		System.out.println("Type your favourite superhero: ");
		System.out.println("1.Batman 2.Spiderman 3.Ironman ");
		
	}

}

class Spiderman {
	
	public void movie2() {
		
		System.out.println(" ");
		System.out.println("Spiderman Homecoming");
		System.out.println("Spiderman Far from home");
		System.out.println("Spiderman into the verse");
		// TODO Auto-generated method stub

	}
}

class Batman {
	
	public void movie1() {
		
		System.out.println(" ");
		System.out.println("The Batman Begins");
		System.out.println("Dark knight");
		System.out.println("Dark knight rises");
		// TODO Auto-generated method stub

	}
}

class Ironman {
	
	public void movie3() {
		
		System.out.println(" ");
		System.out.println("Ironman 1");
		System.out.println("Avengers");
		// TODO Auto-generated method stub

	}
}


class One{
	
	public static void main(String[]args) {
		
		Characters ref = new Characters();
		ref.print();
		Scanner scan = new Scanner(System.in);
		String hero = scan.next();
		
		if(hero.equals("Batman")||hero.equals("batman")) {
		
			
			Batman ref1 = new Batman();
			ref1.movie1();
			
		}
		else if(hero.equals("Spiderman")||hero.equals("spiderman")) {
			
			Spiderman ref2 = new Spiderman();
			ref2.movie2();
		}
		else if(hero.equals("Ironman")||hero.equals("ironman")) {
			Ironman ref3 = new Ironman();
			ref3.movie3();
		}
		
		
		
	}
}

