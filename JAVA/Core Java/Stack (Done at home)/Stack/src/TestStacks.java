import java.util.Scanner;

public class TestStacks {

	public static void main(String[] args) {

		FixedStack stack = new FixedStack();
		Stack s = null;
		
		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {

			menu();
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Inside Fixed Stack");
				s=new FixedStack();
				break;
				
			case 2:
				System.out.println("Inside Growable Stack");
				s=new GrowableStack();
				break;
				

			case 3:
				System.out.println("Enter Customer Details:Name,Id, Address ");
				Customer c = new Customer(sc.next(), sc.nextInt(), sc.next());
				s.push(c);
				break;

			case 4:
				s.pop();
				break;

			case 5:
				s.display();
				break;
			case 0:
				exit = true;
				break;
			}
		}

		sc.close();
	}

	public static final void menu() {
		System.out.println(
				"1. Fixed Stack \n 2. Growable Stack \n 3. Push Data \n 4. Pop Data \n 5.Display data \n 0. Exit");
	}
}
