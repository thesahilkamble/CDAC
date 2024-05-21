package com.Pen;

import java.util.Date;
import java.util.ArrayList;

public class StyleWithPen {
	
	private static int idCount = 1;
	private int id;
	private String brand;
	private String color;
	private String inkColor;
	private String material;
	private int stock;
	private Date stockListingDate;
	private Date stockUpdateDate;
	private double price;
	private double discount;

	 public StyleWithPen(String brand, String color, String inkColor, String material, int stock, Date stockListingDate, double price) {}
		
	public void Pen(String brand, String color, String inkColor, String material, int stock,
			Date stockListingDate, double price) {
		this.id=idCount++;
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.stockListingDate = stockListingDate;
		this.price = price;
		this.discount = 0.0;
	}
	
	@Override
	public String toString ()
	{
		return "ID:"+id +"Brand: " + brand +"Color: " + color +"Ink Color: " + inkColor +"Material: " + material+"Stock: " + stock +"Stock Listing Date: " + stockListingDate+"Price: " + price+"Discount: " + discount;
	}


//	public StyleWithPen() {
//	}
//
//
//	public String getBrand() {
//		return brand;
//	}
//
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//
//	public String getColor() {
//		return color;
//	}
//
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//
//	public String getInkColor() {
//		return inkColor;
//	}
//
//
//	public void setInkColor(String inkColor) {
//		this.inkColor = inkColor;
//	}
//
//
//	public String getMaterial() {
//		return material;
//	}
//
//
//	public void setMaterial(String material) {
//		this.material = material;
//	}
//
//
//	public int getStock() {
//		return Stock;
//	}
//
//
//	public void setStock(int stock) {
//		Stock = stock;
//	}
//
//
//	public LocalDate getStockListingDate() {
//		return stockListingDate;
//	}
//
//
//	public void setStockListingDate(LocalDate stockListingDate) {
//		this.stockListingDate = stockListingDate;
//	}
//
//
//	public double getDiscount() {
//		return discount;
//	}
//
//
//	public void setDiscount(double discount) {
//		this.discount = discount;
//	}	
//	
	
	
}
