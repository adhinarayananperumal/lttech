package com.bookmyshow.ticket;

public class IssueTicketClient {

	public static void main(String[] args) {

		IssueTicket issueTicket = IssueTicket.getIssueTicketObject();
		IssueTicket issueTicket1 = IssueTicket.getIssueTicketObject();
		IssueTicket issueTicke2 = IssueTicket.getIssueTicketObject();

		System.out.println(issueTicket.hashCode());
		System.out.println(issueTicket1.hashCode());
		System.out.println(issueTicke2.hashCode());



		TicketPojo ticketPojo = issueTicket.issueTicket();

		System.out.println(ticketPojo.getTicketId());
		
		TicketPojo ticketPojo1 = issueTicket1.issueTicket();
		System.out.println(ticketPojo1.getTicketId());


	}

}
