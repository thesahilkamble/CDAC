package linkedlist;

public class LinkedListImpl<T> implements LinkedList<T> {
	public Node head = null;

	 static class Node<T> {
	        T data;
	        Node next;
	        
	        Node(T d) { data = d; next = null; }
	    }

	@Override
	public void insertAtFirst(T data) {
		Node temp = new Node(data);
		
		if(head == null)
		{
			head = temp;
		}
		
		else
		{
			temp.next = head;
			
			head =temp;
		}
		
	}

	@Override
	public void insertAtPos(T pos) {
		// TODO Auto-generated method stub
	}

	@Override
	public void insertAtLast(T data) {
	Node temp = new Node(data);
		
		if(head == null)
		{
			head = temp;
		}
		
		else
		{
			Node abc = head;
			while(abc.next != null)
			{
				abc = abc.next; 
			}
			
			abc.next = temp;
		}
	}

	@Override
	public void remove(int pos) {
		
		if(pos == 0)
		{
			Node temp = head;
			head = head.next;
			temp.next = null;
		}
		else
		{
			Node abc = head;
			for(int i =0 ; i<pos-1 || abc.next != null ;i++ )
			{
				abc = abc.next;
			}
			
			abc.next = abc.next.next;
		}
		
	}


}
