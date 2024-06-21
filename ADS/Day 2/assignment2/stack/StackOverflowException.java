package assignment2.stack;

public class StackOverflowException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public StackOverflowException(String message) {
		super(message);
	}

}
