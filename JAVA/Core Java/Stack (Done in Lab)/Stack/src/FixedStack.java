package Day6_8April_StackImp.sahil;

import java.util.Arrays;
import java.util.Scanner;

public class FixedStack implements Stack {

	int size = STACK_SIZE;

	int top = -1;
	Customer[] fixedStack = new Customer[size];

	@Override
	public void push(Customer c) {
		if (top == fixedStack.length) {
			System.out.println("Stack is Full!!");
		} else {
			top++;
			fixedStack[top] = c;

		}
	}

	@Override
	public void pop() {

		if (top == -1) {
			System.out.println("Stack is Empty!");
		} else {
			fixedStack[top] = null;
			top--;
		}

	}

	public void display() {
		for (Customer f : fixedStack) {
			if (f != null)
				System.out.println(f);

		}
	}

	public boolean isFull() {
		if ((top + 1) == size) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void growPush(Customer c) {
//		if (top == fixedStack.length-1) {
//			System.out.println("Stack is Full! \n Do you wish to increase stack size (1.Yes 2.N0) ?");
//			Scanner sc = new Scanner(System.in);
//			int ch = sc.nextInt();

		if (isFull()) {
			size *= 2;
			top++;
			System.out.println("Increase stack size by: ");

			// int increment = sc.nextInt();

			Customer[] newStack = new Customer[fixedStack.length];

			for (int i = 0; i < fixedStack.length; i++) {
				newStack[i] = fixedStack[i];
//				System.out.println("abc");
			}

			fixedStack = new Customer[size];

			for (int i = 0; i < newStack.length; i++) {
				fixedStack[i]=newStack[i];				
			}

			// Arrays.toString(fixedStack);
			fixedStack[top] = c;
			System.out.println(top);
			top++;
			System.out.println("Stack Size increased succsefully!");
		} else {
			top++;
			fixedStack[top] = c;

		}
		// sc.close();
	}

	@Override
	public void growPop() {

		if (top == -1) {
			System.out.println("Stack is Empty!");
		} else {
			fixedStack[top] = null;
			top--;
		}

	}

}
