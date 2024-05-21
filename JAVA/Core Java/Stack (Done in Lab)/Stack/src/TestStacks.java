package Day6_8April_StackImp.sahil;

import java.util.Scanner;

public class TestStacks {

	public static void main(String[] args) {

		FixedStack stack = new FixedStack();
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int options = 0;
		menu1();
		
		System.out.println("Enter your choice");
		options = sc.nextInt();
		
		if(options == 1)
		{
			System.out.println("Inside Fixed Stack");
			while (!exit) {
				menu2();
				System.out.println("Enter your choice: ");
				int option = sc.nextInt();
				switch (option) {

				case 1:
					System.out.println("Enter Customer Details: Name , Id, Address ");
					Customer c = new Customer(sc.next(), sc.nextInt(), sc.next());
					stack.push(c);
					break;

				case 2:
					stack.pop();
					break;

				case 3:
					stack.display();
					break;

				case 0:
					exit = true;
					System.out.println("Exited");
					break;
				}

			}
		}
		else if(options == 2)
		{
			System.out.println("Inside Growable Stack");
			while (!exit) {
				menu2();
				System.out.println("Enter your choice: ");
				int options1 = sc.nextInt();
				
				switch (options1) {
				case 1:
					System.out.println("Enter Customer Details:Name,Id, Address ");
					Customer c = new Customer(sc.next(), sc.nextInt(), sc.next());
					stack.growPush(c);
					break;

				case 2:
					stack.growPop();
					break;

				case 3:
					stack.display();
					break;
				case 0:
					exit = true;
					break;
				}
			}
		}

//		while (!exit) {
//
//			menu1();
//			System.out.println("Enter your choice: ");
//			int choice = sc.nextInt();
//			switch (choice) {
//			case 1: {
//				System.out.println("Inside Fixed Stack");
//				while (!exit) {
//					menu2();
//					System.out.println("Enter your choice: ");
//					int option = sc.nextInt();
//					switch (option) {
//
//					case 1:
//						System.out.println("Enter Customer Details: Name , Id, Address ");
//						Customer c = new Customer(sc.next(), sc.nextInt(), sc.next());
//						stack.push(c);
//						break;
//
//					case 2:
//						stack.pop();
//						break;
//
//					case 3:
//						stack.display();
//						break;
//
//					case 0:
//						exit = true;
//						break;
//					}
//
//				}
//			}
//			
//			break;
//
//			case 2: {
//				
//			}
//			case 0:
//				exit =true;
//				System.out.println("EXITED");
//			}
//		}
//		sc.close();
	}

	public static final void menu1() {
		System.out.println(" 1. Fixed Stack \n 2. Growable Stack \n 0. Exit");
	}

	public static final void menu2() {
		System.out.println(" 1. Push Data \n 2. Pop Data \n 3.Display Data \n 0. Exit");
	}
}
