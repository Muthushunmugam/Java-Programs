package crud.controller;

import crud.controller.*;
import crud.dao.*;
import crud.factory.*;
import crud.service.*;

import java.io.*;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		Details stud;
		
		while(true)
		{
			System.out.println("Enter your choice: \n1.Add\n2.Search\n3.Update\n4.Delete\n5.Exit");
			String choice =sc.nextLine();
			switch(choice)
			{
			case "1":
				System.out.println("Enter ID: ");
				String no = sc.nextLine();
				
				System.out.println("Enter Name: ");
				String nam = sc.nextLine();
				System.out.println("Enter Department: ");
				String depart = sc.nextLine();
				
				Service add = ServiceFactory.getService();
				
				stud = new Details();
				stud.setsId(no);
				stud.setsName(nam);
				stud.setsDept(depart);
				
				String status = add.create(stud);
				System.out.println(status);
				
			case "2":
				
				/*System.out.println("Enter ID: ");
				String no1 = sc.nextLine();
				
				Service search = ServiceFactory.getService();*/
				
			case "3":
				
			case "4":
				
			case "5":
				System.exit(0);
				
			default:
				System.out.println("Enter values from 1-5");
				
				
				
				
				
			}
		}
		

	}

}
