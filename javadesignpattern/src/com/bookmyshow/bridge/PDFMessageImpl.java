package com.bookmyshow.bridge;

import java.util.List;

public class PDFMessageImpl extends BaseMessageSenderImpl implements Message{
	
	
	private MessageSender messageSender;
	
	

	@Override
	public MessagePojo createMessage(MessagePojo messagePojo) {
		senderCreation(messagePojo);
		messageSender.send(messagePojo);
		return messagePojo;
	}

	@Override
	public MessagePojo getMessage(String messageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MessagePojo> listMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MessagePojo getMessageStatus() {
		// TODO Auto-generated method stub
		return null;
	}

}
