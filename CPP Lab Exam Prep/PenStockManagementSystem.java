package Question1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PenStockManagementSystem {
    static ArrayList<Pens> pens = new ArrayList<>();
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Pen Stock Management System");
            System.out.println("1. Add New Pen");
            System.out.println("2. Update Stock of a Pen");
            System.out.println("3. Set Discount for Unsold Pens");
            System.out.println("4. Remove Pens Never Sold in 9 Months");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addNewPen(sc);
                    break;
                case 2:
                    updateStockOfPen(sc);
                    break;
                case 3:
                    setDiscountForUnsoldPens();
                    break;
                case 4:
                    removePensNeverSoldInNineMonths();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    static void addNewPen(Scanner sc) {
        System.out.println("Enter Pen details:");
        System.out.print("Brand: ");
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

        Pens newPen = new Pens(brand, color, inkColor, material, stock, stockListingDate, price);
        pens.add(newPen);

        System.out.println("Pen added successfully!");
    }

    static void updateStockOfPen(Scanner sc) {
        System.out.println("Enter details to update stock:");
        System.out.print("Brand: ");
        String brand = sc.next();
        System.out.print("Color: ");
        String color = sc.next();
        System.out.print("Ink Color: ");
        String inkColor = sc.next();
        System.out.print("Material: ");
        String material = sc.next();
        System.out.print("New Quantity: ");
        int newQuantity = sc.nextInt();

        for (Pens pen : pens) {
            if (pen.brand.equalsIgnoreCase(brand) && pen.color.equalsIgnoreCase(color)
                    && pen.inkColor.equalsIgnoreCase(inkColor) && pen.material.equalsIgnoreCase(material)) {
                pen.stock = newQuantity;
                pen.stockUpdateDate = new Date();
                System.out.println("Stock updated successfully!");
                return;
            }
        }

        System.out.println("Pen not found. Stock not updated.");
    }

    static void setDiscountForUnsoldPens() {
    
        Date currentDate = new Date();
        for (Pens pen : pens) {
            long diffInMillies = Math.abs(currentDate.getTime() - pen.stockUpdateDate.getTime());
            long diffInDays = diffInMillies / (1000 * 60 * 60 * 24);
            long diffInMonths = diffInDays / 30;
            if (diffInMonths >= 3 && pen.stock > 0) {
                pen.discount = 20.0;
            }
        }
        System.out.println("Discount set for unsold pens.");
    }

    static void removePensNeverSoldInNineMonths() {

        Date currentDate = new Date();
        for (int i = pens.size() - 1; i >= 0; i--) {
            Pens pen = pens.get(i);
            long diffInMillies = Math.abs(currentDate.getTime() - pen.stockListingDate.getTime());
            long diffInDays = diffInMillies / (1000 * 60 * 60 * 24);
            long diffInMonths = diffInDays / 30;
            if (diffInMonths >= 9 && pen.stock > 0) {
                pens.remove(i);
            }
        }
        System.out.println("Pens never sold in 9 months removed.");
    }

    static Date parseDate(String dateString) {
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}


	            
	           