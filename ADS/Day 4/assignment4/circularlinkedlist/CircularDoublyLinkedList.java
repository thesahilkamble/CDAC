package circularlinkedlist;

public class CircularDoublyLinkedList {

	class Node
	{
		int value;
		Node prev;
		Node next;
		
		Node(int data)
		{
			this.value = data;
			this.next = null;
			this.prev = null;
		}
		
	}
	
	Node head;
	Node tail;
	
	CircularDoublyLinkedList()
	{
		head = null;
		tail = null;
		
	}
	
	public void insertAtFront(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			tail = head;
		}
		else
		{
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			
			
			head.prev = tail;
			tail.next = head;
		}
		
	}
	
	public void insertAtBack(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			head.prev = newNode;
			head.next = newNode;
			tail = head;
		}
		else
		{
			newNode.prev = head;
			tail.next = newNode;
			tail = newNode;
			
			tail.next = head;
			head.prev = tail;
		}
		
	}
	
	public void display()
	{
		Node newNode = head.next;
		System.out.println(head.value + " ");
		
		while(newNode != head)
		{
			System.out.println(newNode.value + " ");
			newNode = newNode.next;
		}
	}
	
	public void remove(int pos)
	{
		if(pos == 0)
		{
			Node temp = head;
			head = head.next;
			head.prev = tail;
			tail.next = head;
			temp.next = null;
		}
		else
		{
			Node newNode = head;
			for(int i=0;i<pos-1;i++) 
				newNode = newNode.next;
//			
//			newNode.next = newNode.next.next;
//			newNode.next.next.prev = newNode;
//			
//			newNode = newNode.next;
//			newNode.prev = null;
//			newNode.next = null;
		}
		
	}
}
