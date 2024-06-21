package assignment2.stack;

public interface StackInterface<T>{

	public void push(T value);
	public T pop();
	public boolean isFull();
	public boolean isEmpty();
	public void display();
	public void enlarger(T value);
}
