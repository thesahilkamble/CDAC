package com.Cricketer;

public class Cricketer {
	
	 
	static private int cricketerId = 1;
	private String name;
	private int age;
	private String email_id;
	private String phone;
	private int rating;
	
	public Cricketer(String name, int age, String email_id, String phone, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.email_id = email_id;
		this.phone = phone;
		this.rating = rating;
		++cricketerId;
	}
	
	public int getcricketerId() {
		return cricketerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void displayCricketer() { 
		
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Email Id: " + getEmail_id());
		System.out.println("Phone: " + getPhone());
		System.out.println("Rating: " + getRating());
	}

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", email_id=" + email_id + ", phone=" + phone + ", rating="
				+ rating + "]";
	}
	
	
	
	

}
