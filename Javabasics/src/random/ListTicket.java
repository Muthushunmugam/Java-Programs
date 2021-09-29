package random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class ListTicket {
	
	Scanner sc = new Scanner(System.in);
	int arr[]= {1,2,3,6,8};
	boolean run = true;
	String go;
	int [] arrNew=new int[3];
	List<Integer> list1 = new ArrayList<Integer>();
	List<Integer> list2 = new ArrayList<Integer>();
	Set<Integer>seatSet;
	int count=0;
	public void test2()
	{	

		 System.out.println("Allowed only 3 seats per user: ");
		 
			for(int j =0; j<arrNew.length; j++)
			{	
				//count++;
				System.out.println("Enter your seat Number");
				arrNew[j] = sc.nextInt();
				count++;
				if( j < 2)
				{
				System.out.println("More seat? Y/N");
				go = sc.next().toLowerCase();
				if(go.equals("y"))
						{
							continue;
						}
				else
						{
							break;
						}
				}
			}

for(int ar1 : arr)
	{
		list1.add(ar1);
	}
for(int ar2 : arrNew)
	{
	list2.add(ar2);
	}

seatSet = new HashSet<>(list1);
seatSet.addAll(list2);
seatSet.removeAll(list1);
	
System.out.println("Your seats booked\nHappy Trip");
System.out.println(seatSet);
	
	}
public static void main(String[] args) {
		
		//LoginFrame loginFrame = new LoginFrame();
		//loginFrame.test3();	
	ListTicket ref = new ListTicket();
	ref.test2();
	
}
}

