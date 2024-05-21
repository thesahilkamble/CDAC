package com.Pen;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Pens {

	public static ArrayList<StyleWithPen> pen = new ArrayList<>();
	public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	public static Scanner sc = new Scanner(System.in);

//	public static StyleWithPen pen = new StyleWithPen();
	public static void main(String[] args) {
		boolean exit = false;
		int choice = 0;

		while (!exit) {
			System.out.println(
					"\n 1. Add new pen \n 2. Update stock of pen \n 3. Set discount \n 4. Remove pens unsold in 9 months \n 5. Exit \n");
			System.out.println("\n Enter Choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;

			case 4:
				break;

			}

		}
	}

	public static void addNewPen() {
		System.out.println("Enter Pen Details");
		System.out.println("Brand: ");
		String brand = sc.next();
		System.out.print("Color: ");
		String color = sc.next();
		System.out.print("Ink Color: ");
		String inkColor = sc.next();
		System.out.print("Material: ");
		String material = sc.next();
		System.out.print("Stock: ");
		int stock = sc.nextInt();
		System.out.print("Stock Listing Date (yyyy-MM-dd): ");
		Date stockListingDate = parseDate(sc.next());
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		StyleWithPen newPen = new StyleWithPen(brand,color,inkColor,material,stock,stockListingDate,price);
	}

}

