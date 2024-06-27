package circularlinkedlist;

public class TestCircularLinkedList {

	public static void main(String[] args) {
		
		CircularDoublyLinkedList c = new CircularDoublyLinkedList();
		
		c.insertAtFront(20);
		c.insertAtFront(30);
		c.insertAtFront(40);
		c.insertAtFront(10);
		c.remove(1);
		c.display();
	}

}
