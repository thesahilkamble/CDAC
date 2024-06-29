package assignment3.doublylinkedlist;

public class DoublyLinkedList {

	class Node {
		int value;
		Node next;
		Node prev;

		public Node(int data) {
			this.value = data;
			this.next = null;
			this.prev = null;
		}
	}

	Node head;
	Node tail;

	public DoublyLinkedList() {
		head = null;
		tail = null;
	}

	public void insertAtFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node temp = head;
			temp.prev = newNode;
			newNode.next = temp;
			head = newNode;
		}
	}

	public void insertAtLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node tempNode = tail;

			tempNode.next = newNode;
			newNode.prev = tempNode;
			tail = newNode;

		}
	}

	public void remove(int pos) {

		Node tempNode = head;
		for (int i = 0; i < pos - 1; i++) {
			tempNode = tempNode.next;
		}
		Node tempNode1 = tempNode;
		if (pos == 0) {
			tempNode.next.prev = null;
			tempNode = tempNode.next;
			head.next = null;

			head = tempNode;
		} else if (tempNode.next == tail) {

			tail.prev = null;
			tail = tempNode;
			tempNode.next = null;
		}

		else {
			tempNode.next.prev = null;
			tempNode.next = tempNode.next.next;
			tempNode = tempNode.next;
			tempNode.prev.next = null;
			tempNode.prev = tempNode1;
		}

	}

	public void removeAll(int value) {
//		Node tempNode = head;
//		Node tempNode1 = tempNode;
//		while (tempNode != null) {
//			if (value == tempNode.next.value) {
//				tempNode.next.prev = null;
//				tempNode.next = tempNode.next.next;
//				tempNode = tempNode.next;
//				tempNode.prev.next = null;
//				tempNode.prev = tempNode1;
//
//			}
//			tempNode = tempNode.next;
//		}

		int count = 0;
		Node tempNode = head;

		while (tempNode != null) {
			if (tempNode.value == value) {
				remove(count);
			}
			System.out.println(tempNode.value + " " + count);
			count++;
			tempNode = tempNode.next;
		}
		System.out.println();
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
