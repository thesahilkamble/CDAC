



public class GrowableStack implements Stack {
	int top = -1;
	Customer GrowableStack[] = new Customer[STACK_SIZE];

	@Override
	public void push(Customer c){

		if(isFull()) {
			Customer []tmp = new Customer[GrowableStack.length];
			System.out.println(tmp.length);
			
			for(int i=0; i<GrowableStack.length;i++){
			
				tmp[i]= GrowableStack[i];
			
			}
			
			GrowableStack = new Customer [tmp.length*2];
			
				for(int i=0; i<tmp.length;i++){
					
					GrowableStack[i]= tmp[i];
					}
			
				GrowableStack[++top]=c;
						
		}
		
		else {
			GrowableStack[++top]=c;
		}
	}
	@Override
	public void pop() {

		if (top == -1) {
			System.out.println("Stack is Empty!");
		} else {
			GrowableStack[top] = null;
			top--;
		}

	}

	public void display() {
		for (Customer f : GrowableStack) {
			if(f != null)
			System.out.println(f);

		}
	}
	
	public boolean isFull()
	{
		if(top + 1==GrowableStack.length)
			return true;
		return false;
		
	}

}
