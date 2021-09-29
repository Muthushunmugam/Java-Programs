package pack;

//Method Overloading

public class Bank {
	
	public void si(int p ,int n,int r) {
		
		 int si = (p*n*r)/100;
		 System.out.println ("SI = "+si);
		
	}
	public void si(double pri ,int yrs ,float rate) {
		
		 double SimpleInterest = (pri*yrs*rate)/100.00;
		 System.out.println (SimpleInterest);
		
	}
	
	public void si(int y ,float princi ,float rate) {
		
		 double Interest = (y*princi*rate)/100.00;
		 System.out.println ("Interest = "+Interest);
		
	}


	public static void main(String[] args) {
		
		Bank ref = new Bank();
		ref.si(30,2,5);
		ref.si(9000.00,6,10);
		ref.si(7,2222.22f,4.5f);
		

	}

}
