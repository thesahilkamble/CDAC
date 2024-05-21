package com.Customer.Managment;

public class ExceptionHandler {
 
//private static final Pattern mailCheck = Pattern.compile("[a-z]+[a-z0-9]+@[a-z]*\\\\.(com|org|net)");
//private static final Pattern passCheck = Pattern.compile("");
//Scanner sc = new Scanner(System.in);
//private String mail = sc.next();
	
public static CustomerDetails inputHandler(String fName, String lName, String email, String passWord, 
		double registrationAmount, String dob, String plan) 
				throws IllegalArgumentException, AmountException, MailException, PassException{
	ServicePlan type = spc(plan);
	amtCheck(registrationAmount, type);
	mailValidate(email);
	passValidate(passWord);	
	return new CustomerDetails(fName, lName, email, passWord, registrationAmount, dob, type);
	
}

public static boolean mailValidate(String mail) throws MailException{
//	System.out.println("res: " + mail.matches("^[A-Za-z0-9+_.-]+@(.+)$"));
//	boolean res = mail.matches("^[A-Za-z0-9+_.-]+@(.+)$");
//	if(res) {
//		System.out.println("in if");
//		return true;
//	} else {
//		System.out.println("in else");
//		throw new MailException("Not valid mail");
//	}
	if(!(mail.matches("^[A-Za-z0-9+_.-]+@(.+)$"))) {
		throw new MailException("Not valid mail");
	}else {
		return true;
	}
}
public static boolean passValidate(String pass) throws PassException{
	if(!pass.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}$")) {
		throw new PassException("Password not valid");
	}
	else {
		return true;
	}
}

	
public static ServicePlan spc(String names) throws IllegalArgumentException{
		return ServicePlan.valueOf(names.toUpperCase());
		
	}
public static void amtCheck(double amount, ServicePlan sp) throws AmountException{
	if(amount<sp.getMinPlan()) {
		throw new AmountException("Not sufficient amount");
	}
}
}
