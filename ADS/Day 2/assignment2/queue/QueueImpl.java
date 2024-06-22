package queue;

import java.lang.reflect.Array;

public class QueueImpl<T> implements Queue<T> {
	public T arr[];
	public int front;
	public int rear;

	@SuppressWarnings("unchecked")
	public QueueImpl(int size, Class<T> kuchbhi) {
		super();
		this.arr = (T[]) Array.newInstance(kuchbhi, size);
		this.front = 0;
		this.front = 0;

	}

	@Override
	public void add(T value) throws Exception {
		if (isFull()) {
			enlarger();
			}
		arr[rear] = value;
		rear++;
	}

	@Override
	public T remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Mein toh khali hu bro");
		}
		T temp = arr[front];
		front++;
		return temp;
	}

	@Override
	public boolean isFull() {
		return rear == arr.length  ;
	}

	@Override
	public boolean isEmpty() {
		return rear == front;
	}


	@Override
	public void display() {
		for(int i = front ; i<rear; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

	@Override
	public void peek() 
	{
		
	}
	
	@Override
	public void enlarger() {

		@SuppressWarnings("unchecked")
		T temp [] = (T[]) Array.newInstance(arr.getClass().getComponentType(),arr.length*2);
		for(int i = 0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		
		
	}


}
