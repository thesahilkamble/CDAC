package com.ticket.exceptions;

// Exception that is thrown when Ticket does not exist
@SuppressWarnings("serial")
public class TicketNotFoundException extends RuntimeException {
	public TicketNotFoundException(String message) {
		super(message);
	}

}
