package sorted;

public interface SortedLinkedList<T extends Number> extends Iterable<SortedLinkedList.Node<T>> {

	// node
	class Node<T extends Number> {

		T value;
		Node<T> next;

		public Node() {
			this.value = null;
			this.next = null;
		}

		public Node(T value) {
			this.value = value;
			this.next = null;
		}

		public Node(T value, Node<T> next) {
			this.value = value;
			this.next = next;
		}

		public T getValue() {
			return value;
		}

		@Override
		public String toString() {
			return value + ",";
		}

	}

	// to add elements and keep the list sorted
	void add(T element);

	int size();

	// to remove first occurrence of an  elements 
	T removeFirst(T num);
	int positionFromEnd(T num);

}