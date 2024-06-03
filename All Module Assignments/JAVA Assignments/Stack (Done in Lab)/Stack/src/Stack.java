package Day6_8April_StackImp.sahil;


public interface Stack {

	public static final int STACK_SIZE = 2;
	
	// Implementation function
	
	public void push(Customer c);
	public void pop();
	void growPush(Customer c);
	public void growPop();
	
	
}
