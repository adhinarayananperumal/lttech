package com.bookmyshow.bridge;

import java.util.List;

public interface Message {
	
	MessagePojo createMessage(MessagePojo messagePojo);
	MessagePojo getMessage(String messageId);
	List<MessagePojo> listMessage();
	MessagePojo getMessageStatus();

}
