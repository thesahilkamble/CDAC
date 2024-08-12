package com.grv.LinkedList;

public class FlatteningMultiLevelLinkedList {
	
	static Node head;
	
	class Node {
        
        int data;
        Node next;
        Node child;
         
        Node(int d) {
            data = d;
            next = child = null;
        }
    }
	
	void flattenList(Node root) {
		
		Node tail = root;
		
		while(tail.next!=null)
			tail = tail.next;
		
		Node currDown = root;
		
		while(currDown!=tail) {
			
			if(currDown.child != null) {
				tail.next = currDown.child;
				
				while(tail.next!=null)
					tail = tail.next;
				
			}
			
			currDown.child = null;
			currDown = currDown.next;
			
		}
	}

}
