package com.Grocery;

import java.util.Scanner;

public class Tester {

	public static Scanner sc = new Scanner(System.in);
	public static Grocery groceryList = new Grocery();

	public static void main(String[] args) {

		boolean exit = false;
		int choice = 0;

		while (!exit) {
			printInstructions();
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				groceryList.printGroceryList();
				break;

			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchItem();
				break;
			case 6:
				exit = true;
				break;
			}
		}

	}

	public static void printInstructions() {
		System.out.println("\n 1. Display Grocery Items \n " + "2. Add item in the list \n 3. modify item \n "
				+ "4. remove item \n 5. search item \n 6. quit");
	}

	public static void addItem() {

		System.out.println("Please Enter the grocery item: ");
		groceryList.addGroceryItem(sc.nextLine());

	}

	public static void modifyItem() {
		System.out.println("Enter item number: ");
		int itemNo = sc.nextInt();
		System.out.println("Enter replacment item");
		String newItem = sc.nextLine();
		groceryList.modifyGroceryList(itemNo - 1, newItem);
	}

	public static void removeItem() {
		System.out.println("Enter item number: ");
		int itemNo = sc.nextInt();
		groceryList.removeGroceryItem(itemNo - 1);
	}

	public static void searchItem() {
		System.out.println("Item to search for: ");
		String searchItem = sc.nextLine();

		if (groceryList.findItem(searchItem) != null) {
			System.out.println("Found " + searchItem + "in grocery list");
		} else {
			System.out.println(searchItem + " is not in list");
		}

	}
}
