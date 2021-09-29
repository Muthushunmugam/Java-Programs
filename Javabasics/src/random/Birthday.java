package random;

public class Birthday {
	int day,month,year;
	
	Birthday(int d,int m,int y){
		day = d;
		month = m;
		year = y;
	}
	
	public String toString() {
		return ("Birthday: "+day+"."+month+"."+year);
	}
	
	public void Print() {
		System.out.println("day: "+day+"."+month+"."+year);
	}

}

class Person{
	Birthday bday;
	String name;
	Person(String name,Birthday bday){
		this.name=name;
		this.bday=bday;
		
	}
	public void print1() {
		System.out.println("Name: "+name);
		bday.Print();
		
	}
	
}
