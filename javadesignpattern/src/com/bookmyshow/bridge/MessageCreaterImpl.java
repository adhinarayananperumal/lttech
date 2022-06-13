package com.bookmyshow.bridge;

public class MessageCreaterImpl {

	MessagePojo createMessage(MessagePojo messagePojo) {

		if (messagePojo.getMessageType().equals("mobile")) {

		} else if (messagePojo.getMessageType().equals("pdf")) {
			Message pdfmessage =MessageFactoryImpl.getObj("pdf");
			pdfmessage.createMessage(messagePojo);

		} else if (messagePojo.getMessageType().equals("vedio")) {
			Message vediomessage = MessageFactoryImpl.getObj("vedio");

		} else {
			Message textmessage = MessageFactoryImpl.getObj("text");
		}

		return messagePojo;
	}

}
