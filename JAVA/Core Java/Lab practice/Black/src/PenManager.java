import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class PenManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pen> pens = new ArrayList<>();

        while (true) {
            System.out.println("1. Add new Pen");
            System.out.println("2. Update stock of aPen");
            System.out.println("3. Set discount of 20% for all the pens which are not at all sold in last 3 months");
            System.out.println("4. Remove Pens which are never sold once listed in 9 months");
            System.out.println("5. Exit");
            System.out.println("Select option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    addNewPen(scanner, pens);
                    break;
                case 2:
                    updateStockOfPen(scanner, pens);
                    break;
                case 3:
                    setDiscountForUnsoldPens(scanner, pens);
                    break;
                case 4:
                    removeUnsoldPens(scanner, pens);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addNewPen(Scanner scanner, List<Pen> pens) {
        System.out.println("Enter Pen details:");
        System.out.println("Brand: ");
        String brand = scanner.nextLine();
        System.out.println("Color: ");
        String color = scanner.nextLine();
        System.out.println("Ink Color: ");
        String inkColor = scanner.nextLine();
        System.out.println("Material: ");
        String material = scanner.nextLine();
        System.out.println("Stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.println("Stock Listing Date (dd-mm-yyyy): ");
        String stockListingDate = scanner.nextLine();
        System.out.println("Price: ");
        double price = scanner.nextDouble();
        Pen newPen = new Pen(brand, color, inkColor, material, stock, stockListingDate, price);
        pens.add(newPen);
    }

    private static void updateStockOfPen(Scanner scanner, List<Pen> pens) {
        System.out.println("Enter Pen details to update stock:");
        System.out.println("Brand: ");
        String brand = scanner.nextLine();
        System.out.println("Material: ");
        String material = scanner.nextLine();
        System.out.println("Color: ");
        String color = scanner.nextLine();
        System.out.println("Ink Color: ");
        String inkColor = scanner.nextLine();
        System.out.println("New quantity: ");
        int newQuantity = scanner.nextInt();
        for (Pen pen : pens) {
            if (pen.getBrand().equals(brand) && pen.getMaterial().equals(material) && pen.getColor().equals(color) && pen.getInkColor().equals(inkColor)) {
                pen.setStock(newQuantity);
                break;
            }
        }
    }

    private static void setDiscountForUnsoldPens(Scanner scanner, List<Pen> pens) {
        LocalDate currentDate = LocalDate.now();
        LocalDate threeMonthsAgo = currentDate.minusMonths(3);
        for (Pen pen : pens) {
            LocalDate stockUpdateDate = LocalDate.parse(pen.getStockUpdateDate());
            if (stockUpdateDate.isBefore(threeMonthsAgo)) {
                pen.setDiscount(20);
            }
        }
    }

    private static void removeUnsoldPens(Scanner scanner, List<Pen> pens) {
        LocalDate currentDate = LocalDate.now();
        LocalDate nineMonthsAgo = currentDate.minusMonths(9);
        for (int i = 0; i < pens.size(); i++) {
            Pen pen = pens.get(i);
            LocalDate stockListingDate = LocalDate.parse(pen.getStockListingDate());
            if (stockListingDate.isBefore(nineMonthsAgo)) {
                pens.remove(i);
                i--;
            }
        }
    }
}

class Pen {
    private String id;
    private String brand;
    private String color;
    private String inkColor;
    private String material;
    private int stock;
    private String stockUpdateDate;
    private String stockListingDate;
    private double price;
    private double discount;

    public Pen(String brand, String color, String inkColor, String material, int stock, String stockListingDate, double price) {
        this.id = UUID.randomUUID().toString();
        this.brand = brand;
        this.color = color;
        this.inkColor = inkColor;
        this.material = material;
        this.stock = stock;
        this.stockUpdateDate = LocalDate.now().toString();
        this.stockListingDate = stockListingDate;
        this.price = price;
        this.discount = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInkColor() {
        return inkColor;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getStockUpdateDate() {
        return stockUpdateDate;
    }

    public void setStockUpdateDate(String stockUpdateDate) {
        this.stockUpdateDate = stockUpdateDate;
    }

    public String getStockListingDate() {
        return stockListingDate;
    }

    public void setStockListingDate(String stockListingDate) {
        this.stockListingDate = stockListingDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}