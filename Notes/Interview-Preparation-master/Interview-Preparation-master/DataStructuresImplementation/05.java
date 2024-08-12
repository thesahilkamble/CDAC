package com.grv.LinkedList;

public class Node<T>{
	T data;
	Node next;
	
	Node(T data){
		this.data = data;
	}
}

public class LinkedList<T> {
	
	private Node<T> head;
	private Node<T> last;
	
	public LinkedList(){
		head = null;
		last = null;
	}
	
	public void add(T data) {
		Node<T> newNode = new Node<>(data);
		if(head == null)
		{
			head = last = newNode;
			return;
		}		
		last.next = newNode;
		last = newNode;
	}
	
	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);
		if(head == null) {
			head = last = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public Node<T> removeFirst(){
		Node<T> temp = head;
		if(head == last) {
			head = null;
			last = null;
			return temp;
		}
		head = head.next;
		return temp;		
	}
	
	public Node<T> removeLast(){
		Node<T> temp = last;
		if(head == last) {
			head = null;
			last = null;
			return temp;
		}
		
		Node<T> temp1 = head;
		while(temp1.next!=last) {
			temp1 = temp1.next;
		}
		
		last = temp1;
		temp1.next = null;
		return temp;
	}
	
	public int indexOf(T data) {
		Node<T> temp = head;
		int index = 0;
		while(temp!= null && temp!=last) {
			if(temp.data.equals(data)) {
				return index;
			}
			index++;
			temp = temp.next;
		}
		return -1;
	}
	
	public boolean contains(T data) {
		Node<T> temp = head;
		while(temp!= null && temp!=last) {
			if(temp.data.equals(data)) {
				return true;
			}
		}
		return false;
	}
	
	public void printList() {
		Node<T> temp = head;
		if(head == null)
			return;
		while(temp != null && temp != last) {
			System.out.print(temp.data+" --> ");
			temp = temp.next;
		}
		System.out.print(last.data);
	}	
}
