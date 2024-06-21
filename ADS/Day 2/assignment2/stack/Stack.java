package assignment2.stack;

import java.lang.reflect.Array;

public class Stack<T> implements StackInterface<T> {
	T arr[];
	int size;
	int top;

	@SuppressWarnings("unchecked")
	public Stack(int size, Class<T> var) {
		super();
		this.size = size;
		this.arr = (T[]) Array.newInstance(var, size);
		this.top = -1;
	}

	@Override
	public void push(T value) {
		if(isFull())
		{
			enlarger(value);
//			throw new StackOverflowException("Stack is full");
		}
		else
		{
			top++;
			arr[top]=value;
		}
	}

	@Override
	public T pop() {
		if(isEmpty()) {
			throw new StackUnderflowException("Stack is Empty");
		}
		else {
			
			T temp = arr[top];
			top--;
			return temp;
		}

		
	}

	@Override
	public boolean isFull() {
		return top == arr.length -1;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public void display() {
	
		for(int i = 0; i<=top; i++) {
			System.out.println(arr[i]);
		}
		
	}

	@Override
	public void enlarger(T value) {

		@SuppressWarnings("unchecked")
		T temp [] = (T[]) Array.newInstance(arr.getClass().getComponentType(),arr.length*2);
		for(int i = 0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		size = temp.length;
		top++;
		arr[top]=value;
		
		
	}

}
