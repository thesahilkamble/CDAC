package com.Customer.Managment;
import com.Customer.Managment.ServicePlan.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class Tester {

public static void sampleData(ArrayList<CustomerDetails> demoList) {
//String fName, String lName, String email, String passWord, double registrationAmount, String dob, ServicePlan plan
demoList.add(new CustomerDetails("Bhuvan", "Pardesi", "bhuvan@gmail.com", "Bhuvan@123", 2500, "2001-02-01", GOLD));
demoList.add(new CustomerDetails("Lakha", "Trivedi", "lakha@gmail.com", "Lakha@123", 6000, "2001-03-03", DAIMOND))	;
demoList.add(new CustomerDetails("Kachra", "Lakhia", "kachra@gmail.com", "Kachra@123", 11000, "2000-01-01", PLATINUM));
demoList.add(new CustomerDetails("Deva", "Sodhi", "deva@gmail.com", "Deva@123", 2000, "1996-03-03", SILVER));
demoList.add(new CustomerDetails("Ishwar", "Vyas", "ishwar@gmail.com", "Ishwar@123", 3000, "1983-03-05", SILVER));
demoList.add(new CustomerDetails("Bhura", "Yadav", "bhura@gmail.com", "Bhura@123", 5000, "1999-03-04", GOLD));
}
	
	public static void main(String[] args) {
		try(Scanner sc=new Scanner (System.in))
		{
		ArrayList<CustomerDetails> custList = new ArrayList<CustomerDetails>();
		sampleData(custList);
		int choice;
		do {
			System.out.println("1. Sign Up");
			System.out.println("2. Sign In");
			System.out.println("3. Change Password");
			System.out.println("4. Unsubscribe");
			System.out.println("5. Display all Customers");
			System.out.println("0. EXIT");
			choice=sc.nextInt();		
			try 
			{
			switch(choice) {
			case 1:
				System.out.println("Enter Customer Details as:"+
			"fName, lName, email, passWord, registrationAmount, dob, ServicePlan type");
				System.out.println("Password must have 1 atleast Uppercase letter, 1 Lowercase Letter, 1 symbol and at least 1 number");
				CustomerDetails customer = inputHandler(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),sc.next(), sc.next());
				custList.add(customer);
				break;
			case 2:
				System.out.println("Enter email");
				String mail = sc.next();
				System.out.println("Enter Password");
				String pass = sc.next();
				for(CustomerDetails cs:custList) {
					if(cs.getEmail().equals(mail)) {
						if(cs.getPassWord().equals(pass)) {
							System.out.println(cs.toString());
						}
					}
				}
				break;
			case 3:
				System.out.println("Enter email");
				String mail2 = sc.next();
				System.out.println("Enter Password");
				String pass2 = sc.next();
				for(CustomerDetails cs:custList) {
					if(cs.getEmail().equals(mail2)) {
						if(cs.getPassWord().equals(pass2)) {
							System.out.println("Enter new Password");
							cs.setPassWord(sc.next());
							System.out.println(cs.toString());
						}
					}
				}
				
				break;
			case 4:
				System.out.println("Enter email to remove customer");
				CustomerDetails csd = new CustomerDetails(sc.next());
				custList.remove(csd);
				break;
			case 5:
				for(CustomerDetails cl: custList) {
					System.out.println(cl);
				}
				break;
			case 0:
				System.out.println("Program Terminated!!");
				System.exit(0);
				break;
			}
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println(e);
			}
			}while(choice!=0);
		
	}
	}
}
