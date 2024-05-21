// Book.java
import java.util.Date;

public class Book {
    private String title;
    private String author;
    private double price;
    private Category category;
    private Date publishDate;

    public Book(String title, String author, double price, Category category, Date publishDate) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
        this.publishDate = publishDate;
    }

    // Getters and setters
}
 
// Category.java
public enum Category {
    FICTION,
    NON_FICTION,
    THRILLER,
    ROMANCE,
    SCIENCE_FICTION,
    HORROR,
    MYSTERY,
    SELF_HELP
}

// BookHandlingException.java
package exceptions;

public class BookHandlingException extends Exception {
    public BookHandlingException(String message) {
        super(message);
    }
}

// CollectionUtils.java
import java.util.ArrayList;
import java.util.List;

public class CollectionUtils {
    public static List<Book> bookList = new ArrayList<>();
}

// IOUtils.java
import java.io.*;

public class IOUtils {
    public static void saveCartContents(List<Book> cart) {
        try {
            FileOutputStream fileOut = new FileOutputStream("cart.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(cart);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}

// Tester.java
package tester;

import java.util.Scanner;
import java.util.List;
import exceptions.BookHandlingException;
import java.util.Date;
import java.util.ArrayList;

public class BookShop {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Book> cart = new ArrayList<>();

    public static void main(String[] args) {
        // Add some sample books to the shop
        CollectionUtils.bookList.add(new Book("Book 1", "Author 1", 20.0, Category.FICTION, new Date()));
        CollectionUtils.bookList.add(new Book("Book 2", "Author 2", 15.0, Category.SCIENCE_FICTION, new Date()));
        CollectionUtils.bookList.add(new Book("Book 3", "Author 3", 25.0, Category.ROMANCE, new Date()));
        CollectionUtils.bookList.add(new Book("Book 4", "Author 4", 18.0, Category.THRILLER, new Date()));
        CollectionUtils.bookList.add(new Book("Book 5", "Author 5", 22.0, Category.MYSTERY, new Date()));

        int choice;
        do {
            System.out.println("1. Display all books from the shop");
            System.out.println("2. Add Book to The Cart");
            System.out.println("3. Show User Cart Contents");
            System.out.println("4. Check out (Exit)");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    displayAllBooks();
                    break;
                case 2:
                    addBookToCart();
                    break;
                case 3:
                    showUserCartContents();
                    break;
                case 4:
                    checkOut();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 4);
    }

    private static void displayAllBooks() {
        for (Book book : CollectionUtils.bookList) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: $" + book.getPrice());
            System.out.println("Category: " + book.getCategory());
            System.out.println("Publish Date: " + book.getPublishDate());
            System.out.println();
        }
    }

    private static void addBookToCart() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        try {
            Book book = findBookByTitle(title);
            cart.add(book);
            System.out.println("Book added to the cart.");
        } catch (BookHandlingException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Book findBookByTitle(String title) throws BookHandlingException {
        for (Book book : CollectionUtils.bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        throw new BookHandlingException("Book not found in the shop.");
    }

    private static void showUserCartContents() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (Book book : cart) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Price: $" + book.getPrice());
                System.out.println("Category: " + book.getCategory());
                System.out.println("Publish Date: " + book.getPublishDate());
                System.out.println();
            }
        }
    }

    private static void checkOut() {
        double total = 0.0;
        if (!cart.isEmpty()) {
            System.out.println("Books purchased:");
            for (Book book : cart) {
                System.out.println(book.getTitle());
                total += book.getPrice();
            }
            System.out.println("Total cart value: $" + total);
            IOUtils.saveCartContents(cart);
            System.out.println("Cart contents saved to file.");
        } else {
            System.out.println("No books purchased.");
        }
    }
}
