package array;

public class QueueArray {
	int queue[] = new int[5];
	int size;
	int front, rear = -1;

	public void enQueue(int data) {
		rear++;
		queue[rear] = data;
		size++;
	}

	public int deQueue() {
		front++;
		int data = queue[front];
		size--;
		return data;
	}

	public void display() {
		for (int i =0; i<size; i++) {
			System.out.println(queue[i] + " ");
		}
	}
}
