package project1;

import java.util.Scanner;

interface Inter1 {
	
	void cal1();
	
	static int add(int a,int b) {
		int c = a+b;
		return(c);
	}
	
	static int sub(int a,int b) {
		int c = a-b;
		return(c);
	}

}


interface Inter2 {
	
	void cal2();
	
	static int mul(int a,int b) {
		int c = a*b;
		return(c);
	}
	
	static int div(int a,int b) {
		int c = a/b;
		return(c);
	}

}

class Operation implements Inter1,Inter2{
	
	Scanner sc = new Scanner(System.in);
	
	int sum ,diff,mul,div;
	int a,b,c,d,e,f,g,h;
	
	 public void cal1() {
		 
		
		 
		 System.out.print("Enter 1st number(add): ");
		  a = sc.nextInt();
		 System.out.print("Enter 2nd number(add): ");
		  b =sc.nextInt();
		 
		 System.out.print("Enter 1st number(sub): ");
		  c = sc.nextInt();
		 System.out.print("Enter 2nd number(sub): ");
		  d =sc.nextInt();
		  
		  sum = a+b;
		  diff = c-d;
		  
		  System.out.println("Add: "+sum);
		  System.out.println("Sub: "+diff);
		  
		
	}
	 public void cal2() {
		 

		 
		 System.out.print("Enter 1st number(mul): ");
		 e = sc.nextInt();
		 System.out.print("Enter 2nd number(mul): ");
		 f =sc.nextInt();
		 
		 System.out.print("Enter 1st number(div): ");
		  g = sc.nextInt();
		 System.out.print("Enter 2nd number(div): ");
		  h =sc.nextInt();
		  
		  mul = e*f;
		  div = g/h;
		  
		  System.out.println("Mul: "+mul);
		  System.out.println("Div: "+div);
		  
			
		}
	 
	 public static void main(String[]args) {
			
			Operation ref = new Operation();
			ref.cal1();
			ref.cal2();
			
			int addition =Inter1.add(3,4);
			int subtraction =Inter1.sub(5,3);
			int multiplication =Inter2.mul(9,4);
			int division =Inter2.div(3,4);
			
			System.out.println(addition +" "+ subtraction +" "+ multiplication +
					" "+ division	);
		}
	 
	 
}

