
public class FixedStack implements Stack {

	int top = -1;
	Customer fixedStack[] = new Customer[STACK_SIZE];

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
			if(f != null)
			System.out.println(f);

		}
	}

}
