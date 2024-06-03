package com.cdac.fruit;

import java.util.Scanner;

import javax.swing.SwingConstants;

public class FruitBasket extends Fruits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basket size");
		Fruits f[] = new Fruits[sc.nextInt()];
		int count = 0;

		boolean exit = false;

		while (!exit) {
			menu();
			switch (sc.nextInt()) {

			case 1:
				// Apple

				break;

			default:
				break;
			}

		}
		sc.close();
	}

}
