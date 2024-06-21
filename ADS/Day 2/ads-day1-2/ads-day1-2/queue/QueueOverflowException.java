package pgdac.ads.queue;

public class QueueOverflowException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public QueueOverflowException(String errorMessage) {
		super(errorMessage);
	}
}
