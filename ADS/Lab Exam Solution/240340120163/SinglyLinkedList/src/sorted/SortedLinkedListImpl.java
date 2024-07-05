package sorted;

import java.util.Iterator;

public class SortedLinkedListImpl<T extends Number & Comparable<T>> implements SortedLinkedList<T> {

	private Node<T> head;
	private int size;

	public SortedLinkedListImpl() {
		head = null;
		size = 0;
	}
	
	@Override
	public Iterator<Node<T>> iterator() {

		return new Iterator<SortedLinkedList.Node<T>>() {

			private Node<T> current = head;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public Node<T> next() {
				Node<T> node = current;
				current = current.next;
				return node;
			}
		};
	}

	
	// to add elements and keep the list sorted

	@Override
	public void add(T element) {
		Node<T> current = head;
		Node<T> newNode = new Node<>(element);

		if (head == null) {
			head = newNode;

		} else if (head.value.compareTo(element) > 0) {
			newNode.next = head;
			head = newNode;
		} else {
			while (current.next != null && current.next.value.compareTo(element) < 0) {
				current = current.next;
			}
			if (current.next != null) {
				newNode.next = current.next;
				current.next = newNode;
			} else {
				current.next = newNode;
			}
		}
		size++;
	}

	// to get the size of the list
	@Override
	public int size() {
		return size;
	}

	// to remove first occurrence of an element

	@Override
	public T removeFirst(T num) {
		T value = null;
		
		if (head != null && head.value.equals(num)) {
			value = head.value;
			head = head.next;
			size--;
		}

		Node<T> current = head;
		while (current.next != null && !current.next.value.equals(num)) {
			current = current.next;
		}
		if (current.next != null) {
			current.next = current.next.next;
			size--;
			return value;
		}

		return null;
	}

	// to find the position of element from end
	
	@Override
	public int positionFromEnd(T num) {
		int indexFromEnd = size - 1;
		Node<T> current = head;

		while (current != null) {
			if (current.value.equals(num)) {
				return indexFromEnd;
			}
			current = current.next;
			indexFromEnd--;
		}
		return -1;
	}

	
	// Method to convert the linked list to a comma-separated string
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		Node<T> current = head;
		while (current != null) {
			stringBuilder.append(current.value);
			if (current.next != null) {
				stringBuilder.append(", ");
			}
			current = current.next;
		}
		return stringBuilder.toString();
	}

}
