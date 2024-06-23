package pgdac.ads.stack;

public interface Stack {
	void push(int element);
	int pop();
	int peek();
	boolean isEmpty();
	boolean isFull();
}
