// Shows the basic functionality of Stack using Arrays

public class StackUsingArray {
    private int[] element;     // Array which will be used as a stack
    private int top;           // top variable always point to top of the stack

	public StackUsingArray(int size) {
      element = new int[size];     // initializeing array
      top = -1;                    // initializing top to -1
	}

/*** Function to double the capacity of stack if it gets full **/	
    private void doubleCapacity() {

        int[] temp = element;
        element = new int[temp.length * 2];
        for (int i = 0; i < temp.length; i++) {
          element[i] = temp[i];
        }
        System.out.println("Old Capacity: " + temp.length + "New Capacity: " + element.length);
    }

/*** Function to push data in stack ***/	
    public void push(int data) throws Exception {
      if (top == element.length - 1) {
        doubleCapacity();
      }
      System.out.println("push : " + data);
      top++;
      element[top] = data;
    }

/*** Function to remove data from stack ***/	
    public int pop() throws Exception {
      if (isEmpty()) {
        throw new OurStackUnderFlowException();
      }
      int temp = element[top];
      top--;
      return temp;
    }

/*** Function to check whether stack is full or not /
    This function does not come into use here as /
    we always increase capacity through double capacity ***/
	
    public boolean isFull() {
      return top == element.length - 1 ? true : false;
    }

/*** Function to check whether stack is empty or not ***/	
    public boolean isEmpty() {
      return top == -1 ? true : false;
    }

/*** Function to return size of stack or /
     number of elements present in stack ***/
    public int size() {
      return top + 1;
    }
}

/*** Class for custom exception which describe underflow condition ***/

public class OurStackUnderFlowException extends Exception{
}
