package assignment2.stack;

public class Tester {

	public static void main(String[] args) {
		int size = 2;

		Stack<Character> stack;

		stack = new Stack<>(size, Character.class);
		stack.push((char)100);
		stack.push((char)102);
		stack.push((char)101);
		stack.display();
		
		stack.pop();
		stack.display();	
		
		stack.push((char)103);
		stack.display();

	}

}
