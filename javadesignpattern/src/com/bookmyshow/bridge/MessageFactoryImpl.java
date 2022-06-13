package com.bookmyshow.bridge;

import com.bookmyshow.factoryexp.HomeLoanDetailImpl;
import com.bookmyshow.factoryexp.Loan;
import com.bookmyshow.factoryexp.PersonalLoanImpl;
import com.bookmyshow.factoryexp.VehicleLoanImpl;

public class MessageFactoryImpl {

	public static Message getObj(String messageType) {

		if (messageType.equals("text")) {
			return new TextMessageImpl();
		} else if (messageType.equals("vedio")) {
			return new VedioMessageImpl();
		} else if (messageType.equals("pdf")) {
			return new PDFMessageImpl();
		} else {
			return null;
		}

	}

}
