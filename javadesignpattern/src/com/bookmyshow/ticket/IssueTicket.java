package com.bookmyshow.ticket;

import java.util.Random;

public class IssueTicket {

	private IssueTicket() {
		System.out.println("constructor called");
	}

	private static IssueTicket issueTicket;

	public synchronized static final IssueTicket getIssueTicketObject() {

		if (issueTicket == null) {
			issueTicket = new IssueTicket();
		}

		return issueTicket;

	}

	public TicketPojo issueTicket() {

		TicketPojo ticketPojo = new TicketPojo();

		ticketPojo.setTicketId(ticketIdzgeneration());

		return ticketPojo;
	}

	String ticketIdzgeneration() {

		Random rd = new Random();
		String ticketId = rd.nextInt() + " - ticket-id";

		return ticketId;
	}

}