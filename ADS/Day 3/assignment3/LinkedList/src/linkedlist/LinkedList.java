package linkedlist;

public interface LinkedList<T> {

	public void insertAtFirst(T data);
	public void insertAtPos(int pos, T data);
	public void insertAtLast(T data);

	public void remove(int pos);
	public void display();
	
	
}
