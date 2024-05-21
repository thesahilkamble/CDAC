package com.Cricketer;

import java.util.Scanner;

public class CricketerTest {

	
	
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
	
//		Cricketer C1 = new Cricketer("Virat", 35, "Virat18@gmail.com","6746454969", 02 );
//		Cricketer C2 = new Cricketer("Rohit", 38, "Rohit45@gmail.com","123567890", 03 );
//		Cricketer C3 = new Cricketer("Sachin", 52, "Sachin10@gmail.com","32937230231", 01 );
//		Cricketer C4 = new Cricketer("MSD", 18, "Dhoni7@gmail.com","9784766969", 10 );
//		Cricketer C5 = new Cricketer("KlRahul", 32, "klrahul1@gmail.com","6969696969", 15 );
//	
//	        cricketerClass.addCricketer(C1);
//	        cricketerClass.addCricketer(C2);
//	        cricketerClass.addCricketer(C3);
//	        cricketerClass.addCricketer(C4);
//	        cricketerClass.addCricketer(C5);
		CricketerClass c = new CricketerClass();
	
		 boolean exit = false;
	        while (!exit) {
	        	
	            System.out.println("***Cricketer Management System*********");
	            System.out.println("1. Add a Cricketer");
	            System.out.println("2. Modify Cricketer's Rating");
	            System.out.println("3. Search Cricketer by Name");
	            System.out.println("4. Display All Cricketers");
	            System.out.println("5. Display All Cricketers Sorted by Rating");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();
	           

	            switch (choice) {
	                case 1:
	                	c.addCricketer();
	                    break;
	                case 2:
	                    c.modifyRating();
	                    break;
	                case 3:
	                    c.searchByName();
	                    break;
	                case 4:
	                    c.displayAll();
	                    break;
	                case 5:
	                    c.sortByRating();
	                    break;
	                case 6:
	                    exit = true;
	                    
	                    System.out.println("EXITED");
	
	                    break;
	                default:
	                    System.out.println("Please enter a number between 1 and 6!!");
	            }
	        }
	}
}
