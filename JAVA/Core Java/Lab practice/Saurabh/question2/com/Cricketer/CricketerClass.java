package com.Cricketer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.Cricketer.*;

public class CricketerClass {
	private static Scanner sc = new Scanner(System.in);
	private static List<Cricketer> cricketers;
	
	public CricketerClass() {
		cricketers = new ArrayList<>();
	}
	
	 static void addCricketer() {
	        System.out.print("Enter Cricketer's Name: ");
	        String name = sc.next();
	        System.out.print("Enter Cricketer's Age: ");
	        int age = sc.nextInt();
	        System.out.print("Enter Cricketer's Email ID: ");
	        String email = sc.next();
	        System.out.print("Enter Cricketer's Phone Number: ");
	        String phone = sc.next();
	        System.out.print("Enter Cricketer's Rating: ");
	        int rating = sc.nextInt();
	        Cricketer ck1 = new Cricketer(name,age,email,phone,rating); 
	        cricketers.add(ck1);
	        System.out.println("Added ");
	 }
	 
	  static Cricketer searchCricketer(String name) {
	        for (Cricketer cricketer : cricketers) {
	            if (cricketer.getName().equalsIgnoreCase(name)) {
	                return cricketer;
	            }
	        }
	        return null;
	    }
	 
	
	 
	  static void modifyRating() {
	        System.out.print("Enter Cricketer's Name: ");
	        String name = sc.next();

	        Cricketer cricketer = searchCricketer(name);
	        if (cricketer != null) {
	            System.out.print("Enter new rating: ");
	            int newRating = sc.nextInt();
	            cricketer.setRating(newRating);
	            System.out.println("Rating updated to:"+ newRating);
	        } else {
	            System.out.println("Cricketer not found with name: " + name);
	        }
	    }
	
	  static void searchByName() {
	        System.out.print("Enter Cricketer's Name: ");
	        String name = sc.next();

	        Cricketer cricketer = searchCricketer(name);
	        if (cricketer != null) {
	            System.out.println("Cricketer found in the list " + cricketer);
	        } else {
	            System.out.println("Cricketer is not in the list");
	        }
	    }
	 
	  static void displayAll() {
	        if (cricketers.isEmpty()) {
	            System.out.println("The list is Empty");
	        } else {
	            for (Cricketer cricketer : cricketers) {
	                System.out.println(cricketer);
	            }
	        }
	    }
	
	  static void sortByRating() {
	        if (cricketers.isEmpty()) {
	            System.out.println("List Is Empty");
	        } else {
	            List<Cricketer> ratingAsc= new ArrayList<>(cricketers);
	            Collections.sort(ratingAsc, Comparator.comparingInt(Cricketer::getRating).reversed());
	            for (Cricketer cricketer : ratingAsc) {
	                System.out.println(cricketer);
	                
	                
	            }
	        }
	    }
	}

