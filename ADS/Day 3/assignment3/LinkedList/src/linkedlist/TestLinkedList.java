package linkedlist;

public class TestLinkedList {

	public static void main(String[] args)
	{
		LinkedList List = new LinkedListImpl();
		
		List.insertAtFirst(100);
		List.insertAtFirst(110);
		List.insertAtFirst(120);
		List.insertAtFirst(130);
		List.insertAtFirst(140);
		List.insertAtFirst(150);
		List.insertAtFirst(160);
		List.insertAtLast(300);
		List.insertAtLast(400);
		List.insertAtLast(500);
		List.insertAtPos(1, 800);
		List.insertAtPos(4, 7800);
		List.insertAtPos(7, 9800);
		
		List.display();
		
	}

}
 