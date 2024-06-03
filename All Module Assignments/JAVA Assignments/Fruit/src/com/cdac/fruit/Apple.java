package com.cdac.fruit;

public class Apple extends Fruits {

	public Apple(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		
	}

	@Override
	public String toString() {
		return "Apple toString()=" + super.toString() + ", taste()=" + taste();
	}
	@Override
	public String taste() {
		return "Sweet and sour";
}
	
	public void jam()
	{	
	System.out.println(getName() +" "+ getWeight()+" "+ "Making Jam!!");	
	}

}
