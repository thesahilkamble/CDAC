package Question1;

import java.util.Date;

public class Pens {
	    static int idCount=1;
	    int id;
	    String brand;
	    String color;
	    String inkColor;
	    String material;
	    int stock;
	    Date stockListingDate;
	    Date stockUpdateDate;
	    double price;
	    double discount;
	    
	   public Pens(String brand2, String color2, String inkColor2, String material2, int stock2,
				Date stockListingDate2, double price2) {
		
		}

	public void Pen(String brand, String color, String inkColor, String material, int stock, Date stockListingDate, double price) {
	        this.id=idCount++;
		   	this.brand = brand;
	        this.color = color;
	        this.inkColor = inkColor;
	        this.material = material;
	        this.stock = stock;
	        this.stockListingDate = stockListingDate;
	        this.stockUpdateDate=stockListingDate;
	        this.price = price;
	        this.discount = 0.0;
	    }

	   public void display() {
	        System.out.println("ID:"+id +"Brand: " + brand +"Color: " + color +"Ink Color: " + inkColor +"Material: " + material+"Stock: " + stock+"Stock Listing Date: " + stockListingDate+"Price: " + price+"Discount: " + discount);
	   }  
}
