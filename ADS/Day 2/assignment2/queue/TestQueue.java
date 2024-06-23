package queue;

public class TestQueue {

	public static void main(String[] args) throws Exception {
	
		Queue<Integer> queue = new QueueImpl<>(3, Integer.class);
		
		queue.add(10);
		queue.add(120);
		queue.add(150);
		
		queue.display();
		queue.remove();

	}

}
