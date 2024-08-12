class StackUsingLinkedList{
    
    private Node top = null;
    private int size;
    
    public void push(int data){
        Node<Integer> currNode = new Node<Integer>(data);
        if(top == null)
           top = currNode;
        else{
            currNode.next = top;
            top = currNode;
        }
    }
    
    public int pop(){     
        if(top == null)
           return new Exception();
        else{
            int data = top.data;
            top = top.next;
            return data;
        }
    }
    
    public int size(){
        return this.size;
    }
    
    public boolean isEmpty(){
        return this.size == 0;
    }
}

class Node<T> {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
