/**
 * @author Gaurav Rajput - grv0908@gmail.com
 */

class DoublyLinkedList<T>{
    private int length;
    private Node<T> head;
    private Node<T> tail;

    DoublyLinkedList(){
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public int size(){
        return this.length;
    }

    /**
     * Insert a node at head or front position
     */
    public void insertAtHead(T data){
        this.length++;
        if(head == null){
            this.head = new Node<T>(data);
            this.tail = head;
            return;
        }
        Node<T> temp = new Node<T>(data);
        temp.next = head;
        head.prev = temp;
        head = temp;
    }

    /**
     * Insert a node a tail or last position
     */
    public void insertAtTail(T data){
        this.length++;
        if(head == null){
            this.head = new Node<T>(data);
            this.tail = head;
            return;
        }
        Node<T> temp = new Node<T>(data);
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
    }

    /**
     * Insert a node at particular index
     */
    public void insertAtIndex(T data, int index) throws IndexOutOfBoundsException{
        if(index > this.length || index < 0){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            insertAtHead(data);
        }
        else if(index == this.length){
            insertAtTail(data);
        }
        else{
            this.length++;
            Node<T> temp = head;
            int count = 0;
            while(count < index){
                temp = temp.next;
                count++;
            }
            Node<T> newNode = new Node<T>(data);
            newNode.next = temp;
            newNode.prev = temp.prev;
            temp.prev.next = newNode; 
            temp.prev = newNode;
        }
    }
    
    /**
     * Remove head of the list
     */
    public void removeHead(){
        if(head == null){
            return;
        }

        this.length--;
        if(this.length == 1){
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    /**
     * Remove tail of list
     */
    public void removeTail(){
        if(head == null){
            return;
        }

        this.length--;
        if(this.length == 1){
            head = tail = null;
            return;
        }

        Node<T> temp = tail.prev;
        temp.next = null;
        tail.prev = null;
        tail = temp;
    }

    /**
     * Remove node of list at a particular index
     */
    public void removeAtIndex(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= this.length){
            throw new IndexOutOfBoundsException();
        }

        if(index == 0){
            this.removeHead();
        }
        else if(index == this.length - 1){
            this.removeTail();
        }
        else{
            this.length--;
            int count = 0;
            Node<T> temp = head;
            while(count < index - 1){
                temp = temp.next;
                count++;
            }

            Node<T> removedNode = temp.next;
            temp.next = removedNode.next;
            if(removedNode.next != null)
                removedNode.prev = temp;
            removedNode.prev = null;
            removedNode.next = null;
        }
    }

    /**
     * Printing all nodes
     */
     public void printAll(){
         if(head == null){
             return;
         }
         Node<T> temp = head;
         while(temp != null){
             System.out.print(temp.data + " ");
             temp = temp.next;
         }
         System.out.println();
     }
}