package com.bookmyshow.bridge;

import java.util.List;

public class VedioMessageImpl extends BaseMessageSenderImpl implements Message {

	@Override
	public MessagePojo createMessage(MessagePojo messagePojo) {
		senderCreation(messagePojo);
		messageSender.send(messagePojo);
		return null;
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
