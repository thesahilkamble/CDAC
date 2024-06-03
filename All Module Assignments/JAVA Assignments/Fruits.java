package com.cdac.fruit;

public class Fruits {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;

    public Fruits(String color, double weight, String name, boolean fresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.fresh = fresh;
	}

	@Override
	public String toString() {
		return "Fruits color="+ color + ",weight=" + weight + ",name=" + name + ", fresh=" + fresh;
	
	}
public String taste()
{
	return "bad taste" ;

}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public boolean isFresh() {
	return fresh;
}
public void setFresh(boolean fresh) {
	this.fresh = fresh;
}

public static void menu()
{
	System.out.println("1. Mango ");		
	System.out.println("2. Orange ");
	System.out.println("3. Apple ");
	System.out.println("4. Display all Fruits ");
	System.out.println("5. Info of all fruits ");
	System.out.println("6. Mark not fresh ");
	System.out.println("7. Mark all sour  ");

}
}