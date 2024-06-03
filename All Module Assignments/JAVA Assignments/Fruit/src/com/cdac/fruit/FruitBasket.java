package com.cdac.fruit;

import java.util.Scanner;

import javax.swing.SwingConstants;

public class FruitBasket extends Fruits {

	public FruitBasket(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basket size");
		Fruits f[] = new Fruits[sc.nextInt()]; //reference array of type fruits
		int count = 0; 
		int index = 0;
		boolean exit = false;
		while (!exit) {
			menu();
			switch (sc.nextInt()) {

			case 1:
				if (count < f.length) {
					f[count] = new Mango("Yellow", 200, "Kesar Mango", true);
					count++;
				} else
					System.out.println("Basket is full!");
				break;

			case 2:
				if (count < f.length) {
					f[count] = new Orange("Orange", 200, "Nagpuri Orange", true);
					count++;
				} else
					System.out.println("Basket is full!");
				break;

			case 3:
				if (count < f.length) {
					f[count] = new Apple("Green", 100, "Kashmiri Apple", true);
					count++;
				} else
					System.out.println("Basket is full!");
				break;

			case 4:
				for (Fruits a : f) {
					System.out.println(a.getName());
				}
				break;

			case 5:
				for (Fruits a : f) {
					if (a.isFresh()) {
						System.out.println(a.getName() + " " + a.getColor() + " " + a.getWeight() + " " + a.taste());
					}
				}
				break;

			case 6:

				System.out.println("Enter index of stale fruit");
				index = sc.nextInt();
				if (index < f.length && index >= 0) {
					f[index].setFresh(false);
					System.out.println("Marked stale");
				} else
					System.out.println("Index out of bound");

				break;

			case 7:
				for (Fruits a : f) {
					if (a.taste().equalsIgnoreCase("sour")) {
						a.setFresh(false);
					}
				}
				System.out.println("All sour fruits marked stale");
				break;

			case 8:
				System.out.println("Enter index of fruit");
				index = sc.nextInt();

				if (index < f.length && index >= 0) {

					if (f[index] instanceof Mango) {
						if (f[index].isFresh())
							((Mango) f[index]).pulp();
						else
							System.out.println("Fruit is stale, can't make pulp");
					}

					else if (f[index] instanceof Orange) {
						if (f[index].isFresh())
							((Orange) f[index]).juice();
						else
							System.out.println("Fruit is stale, can't make juice");
					} else if (f[index] instanceof Apple) {
						if (f[index].isFresh())
							((Apple) f[index]).jam();
						else
							System.out.println("Fruit is stale, can't make jam");
					}

				} else
					System.out.println("Index out of bound");
				break;

			case 0:
				System.out.println("Thank you for shopping at Dmart!");
				exit = true;
				break;

			default:
				System.out.println("Invalid Choice");
				break;

			}

		}
		sc.close();
	}

}
