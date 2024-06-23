package linkedlist;

public class LinkedListImpl<T> implements LinkedList<T> {

	static class Node<T> {
		T data;
		Node next;

		Node() {
		};

		Node(T d) {
			data = d;
			next = null;
		}
	}

	private Node head;

	public LinkedListImpl() {
		this.head = null;
	}

	@Override
	public void insertAtFirst(T data) {
		Node temp = new Node(data);

		if (head == null) {
			head = temp;
		}

		else {
			temp.next = head;

			head = temp;
		}

	}

	@Override
	public void insertAtPos(int pos, T data) {
		if (head == null || pos <= 1)
			insertAtFirst(data);

		else {
			Node temp = new Node(data);
			Node abc = head;
			for (int i = 1; i < pos - 1; i++) 
		
				abc = abc.next;
			
			temp.next = abc.next;
			abc.next = temp;
		}
	}
	
	@Override
	public void insertAtLast(T data) {
		Node temp = new Node(data);

		if (head == null) {
			head = temp;
		}

		else {
			Node abc = head;
			while (abc.next != null) {
				abc = abc.next;
			}

			abc.next = temp;
		}
	}

	@Override
	public void remove(int pos) {

		if (pos == 0) {
			Node temp = head;
			head = head.next;
			temp.next = null;
		} else {
			Node abc = head;
			for (int i = 0; i < pos - 1 || abc.next != null; i++) {
				abc = abc.next;
			}

			abc.next = abc.next.next;
		}

	}

	@Override
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}
