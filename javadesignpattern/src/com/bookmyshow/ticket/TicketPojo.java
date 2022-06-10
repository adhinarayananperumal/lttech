package com.bookmyshow.ticket;

import java.util.Date;

public class TicketPojo {
	
	
	private String ticketId;
	private String cinemaHall;
	private Date showTime;
	private String ticketStatus;
	private int seatNo;
	
	
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getCinemaHall() {
		return cinemaHall;
	}
	public void setCinemaHall(String cinemaHall) {
		this.cinemaHall = cinemaHall;
	}
	public Date getShowTime() {
		return showTime;
	}
	public void setShowTime(Date showTime) {
		this.showTime = showTime;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	
	
	
	

}
