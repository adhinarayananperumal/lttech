package com.bookmyshow.bridge;

abstract public class BaseMessageSenderImpl {
	
	protected  MessageSender messageSender;

	void senderCreation(MessagePojo messagePojo) {
		if (messagePojo.getSendingMode().equals("sms")) {
			this.messageSender = new SMSSenderImpl();

		}else if(messagePojo.getSendingMode().equals("whatsApp")) {
			this.messageSender = new WhatsAppSenderImpl();

		}
	}


}
