package com.bookmyshow.bridge;

public class ibankingLoginClient {

	public static void main(String[] args) {

		MessagePojo messagePojo = new MessagePojo();
		messagePojo.setMessage("You are sending to access from new device , browset chrome we34908593485");
		messagePojo.setSendingMode("mobile");
		messagePojo.setMessageType("Whatsapp");
		

		MessageCreaterImpl message = new MessageCreaterImpl();
		message.createMessage(messagePojo);
		
	

		/*
		 * if(messagePojo.getSendingMode()) {
		 * 
		 * }else {
		 * 
		 * }
		 */

	}

}
