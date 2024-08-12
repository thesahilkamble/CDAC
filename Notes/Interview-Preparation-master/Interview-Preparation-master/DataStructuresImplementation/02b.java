package com.grv.Queue;

public class QueueUsingLinkedList<T>{
    
    Node<T> front;
    Node<T> rear;
    int size;
    
    QueueUsingLinkedList(){
        front = null;
        rear = null;
        size = 0;
    }
    
    public void enqueue(T data){
        Node<T> currNode = new Node<>(data);
        if(front == null)
        {
            front = rear = currNode;
            size++;
            return ;
        }
        
        rear.next = currNode;
        rear = currNode;
        size++;
    }
    
    public T dequeue() throws EmptyQueueException{
        if(front == null)
           throw new EmptyQueueException();
        
        T data = front.data;
        front = front.next;
        size--;
        
        return data;
    } 
    
    public boolean isEmpty(){
        return size == 0;
    }
    
}


public class Node<T> {
	T data;
    Node<T> next;
    
    Node(T data){
        this.data = data;
        this.next = null;
    }
}


public class EmptyQueueException extends Exception {

}

