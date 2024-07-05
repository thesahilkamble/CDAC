package array;

public class Tester {
	public static void main(String[] args) {
		QueueArray queue = new QueueArray();
		queue.enQueue(4);
		queue.enQueue(2);
		queue.enQueue(6);
		queue.display();
		System.out.println(queue.deQueue() + " Removed");
		queue.display();
		
	}
}
