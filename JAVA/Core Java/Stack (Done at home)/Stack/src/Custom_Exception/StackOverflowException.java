package Custom_Exception;

@SuppressWarnings("serial")
public class StackOverflowException extends Exception {
	public StackOverflowException(String mesg) {
		super(mesg);
}
}
