package assignment2.stack;

public class StackUnderflowException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public StackUnderflowException(String message) {
		super(message);
	}

}
