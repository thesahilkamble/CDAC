package custom_exceptions;

@SuppressWarnings("serial")
public class ExpireLicenceException extends Exception {
	public ExpireLicenceException(String mesg) {
		super(mesg);
	}

}
