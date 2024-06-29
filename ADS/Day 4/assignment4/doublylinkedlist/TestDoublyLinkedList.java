package assignment3.doublylinkedlist;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

		doublyLinkedList.insertAtFirst(10);
		doublyLinkedList.insertAtFirst(20);
		doublyLinkedList.insertAtFirst(30);
		doublyLinkedList.insertAtFirst(40);
		doublyLinkedList.insertAtFirst(50);

		doublyLinkedList.insertAtLast(900);
		doublyLinkedList.insertAtLast(100);
		doublyLinkedList.insertAtLast(200);
		doublyLinkedList.insertAtLast(300);

		doublyLinkedList.display();
		doublyLinkedList.remove(4);
		doublyLinkedList.display();
		doublyLinkedList.remove(4);
		doublyLinkedList.display();
		doublyLinkedList.remove(4);
		doublyLinkedList.display();
//		doublyLinkedList.removeAll(100);

	}

}
