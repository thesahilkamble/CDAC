import java.util.*;

class Test {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        DoublyLinkedList<Integer> d = new DoublyLinkedList<>();
        d.insertAtHead(12);
        d.insertAtHead(15);
        d.insertAtTail(31);
        d.insertAtTail(50);
        d.insertAtIndex(101, 4);
        d.insertAtIndex(109, 0);
        d.insertAtIndex(3, 3);
       // d.insertAtIndex(500, 7); // outofbound
       // d.insertAtIndex(900, -1); // outofbound
        d.printAll();

        d.removeHead();
        d.removeTail();
        d.removeAtIndex(2);
        d.printAll();

        sc.close();
    }
}