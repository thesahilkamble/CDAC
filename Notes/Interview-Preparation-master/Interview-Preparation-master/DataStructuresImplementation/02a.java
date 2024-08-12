package com.grv.Queue;

public class QueueUsingArray<T>{
    private T[] element;
    private int front;
    private int rear;
    private int size;
    
    public QueueUsingArray(int size){
         element = (T[]) new Object[size];
         front = -1;
         rear = 0;
         size = 0;
    }
    
    public void enqueue(T data) throws QueueFullException{
        if(size == element.length )
           throw new QueueFullException();
         
        element[rear] = data;
        rear = (rear + 1)%element.length;
        size++;
        if(front == -1)
          front = 0;
    }
    
    public T dequeue() throws EmptyQueueException{
        if(size == 0)
           throw new EmptyQueueException();
        
        T data = element[front];
        front = (front + 1)%element.length;
        size--;
        if(size == 0)
        {
            front = -1;
            rear = 0;
        }
        return data;
    }
    
    public boolean isFull(){
        return size == element.length;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int size(){
        return size;
    }  
}



public class EmptyQueueException extends Exception {
}

public class QueueFullException extends Exception {
}
