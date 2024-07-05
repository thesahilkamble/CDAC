package sorted;

import sorted.SortedLinkedList.Node;

public class Tester {

	public static void main(String[] args) {

		SortedLinkedList<Integer> list = new SortedLinkedListImpl<>();

		// inserting elements randomly
		list.add(100);
		list.add(50);
		list.add(20);
		list.add(150);
		list.add(70);
		list.add(20);
		list.add(10);
		list.add(40);

		System.out.println("Elements in the list: " + list.toString());

		// finding position of elements from end of list
		System.out.println("Position from end: " + list.positionFromEnd(10));
		System.out.println("Position from end: " + list.positionFromEnd(100));
		System.out.println("Position from end: " + list.positionFromEnd(200));

		// deleting elements (first occurrence)
		list.removeFirst(20);
		list.removeFirst(150);

		// return comma separated elements from start to end
		System.out.println("Elements in the list after remove: " + list.toString());

		// to get size of the list
		System.out.println("Size of list " + list.size());

		// Display the sorted list
		for (Node<Integer> node : list) {
			System.out.print(node + " ");
		}

	}
}
