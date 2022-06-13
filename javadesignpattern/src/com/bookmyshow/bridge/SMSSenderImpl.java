package com.bookmyshow.bridge;

public class SMSSenderImpl implements MessageSender {

	private MessageSender messageSender;
	
	SMSSenderImpl() {
	}

	SMSSenderImpl(MessageSender messageSender) {
		messageSender = this.messageSender;
	}

	@Override
	public MessagePojo send(MessagePojo messagePojo) {
		// TODO Auto-generated method stub
		messageSender.send(messagePojo);
		return null;
	}

	@Override
	public MessagePojo delete(MessagePojo messagePojo) {
		// TODO Auto-generated method stub
		return null;
	}

}
