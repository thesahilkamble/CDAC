package com.Customer.Managment;

import java.time.LocalDate;
import java.util.Objects;

public class CustomerDetails implements Comparable<CustomerDetails> {
	private int cust_id;
	private String fName, lName, email, passWord;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private static int counter = 1;

	public CustomerDetails(String fName, String lName, String email, String passWord, double registrationAmount,
			String dob, ServicePlan plan) {
		this.cust_id = counter++;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.passWord = passWord;
		this.registrationAmount = registrationAmount;
		this.dob = LocalDate.parse(dob);
		this.plan = plan;
	}

	public CustomerDetails(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "CustomerDetails [cust_id=" + cust_id + ", fName=" + fName + ", lName=" + lName + ", email=" + email
				+ ", passWord=" + passWord + ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", plan="
				+ plan + "]";
	}
//	@Override
//	public boolean equals(Object o) {
//		if(o instanceof CustomerDetails) {
//			CustomerDetails obj= (CustomerDetails) o;
//		return this.passWord==obj.passWord;
//	}
//		return false;
//	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CustomerDetails))
			return false;
		CustomerDetails other = (CustomerDetails) obj;
		return Objects.equals(email, other.email);
	}
	

	@Override
	public int compareTo(CustomerDetails csd) {
		if(this.email.equals(csd.email)) {
			return 0;
		}
		return 1;
	}


}
