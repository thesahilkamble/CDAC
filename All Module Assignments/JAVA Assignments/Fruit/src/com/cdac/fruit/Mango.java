package com.cdac.fruit;

public class Mango extends Fruits {

	public Mango(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		
	}

	@Override
	public String toString() {
		return "Mango " + super.toString() + ", taste()=" + taste();
	}
	@Override
	public String taste() {
		return "sweet";
	}
	
	public void pulp()
	{	
	System.out.println(getName() +" "+ getWeight()+" "+ "Creating Pulp!!");	
	}
}
