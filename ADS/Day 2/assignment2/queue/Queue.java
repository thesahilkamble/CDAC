package queue;

public interface Queue<T> {

	public void add(T value) throws Exception;
	public T remove() throws Exception;
	public boolean isFull();
	public boolean isEmpty();
	public void display();
	public void peek();
	public void enlarger();
}