package random;

public class Players {
	
	String firstname;
	String lastname;
	int total;
	
	Players(String n1,String n2){
		firstname=n1;
		lastname=n2;
		total++;
		System.out.println(total);
		System.out.println(firstname+" "+lastname);}

	public static void main(String[]args) {
		Players ref = new Players("Virat","Kohli");
	
}
}
