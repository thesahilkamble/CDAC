package pgdac.ads.list;

public interface List {
	void addAtFront(int element);
	void addAtRear(int element);
	int deleteFirstNode();
	boolean isEmpty();
	void print();
}
