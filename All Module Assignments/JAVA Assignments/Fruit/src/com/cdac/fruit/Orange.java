package com.cdac.fruit;

public class Orange extends Fruits {

	public Orange(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		
	}

	@Override
	public String toString() {
		return "Orange [toString()=" + super.toString() + ", taste()=" + taste();
	}
	@Override
	public String taste() {
		return "sour";
	}
	
	public void juice()
	{	
	System.out.println(getName() +" "+ getWeight()+" "+ "Extracting Juice!!");	
	}
	
	
}
