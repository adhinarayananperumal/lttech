package com.bookmyshow.proxypatternexp;

public class UPIApp {

Transfer accountTransactionProxy = new AccountTransactionProxy();
	
	
	
	void debitLoanEMI(){
		accountTransactionProxy.debitamount(2300, "pnb4567");
	}
	
	
	
	public static void main(String[] args) {
		
		UPIApp upi= new UPIApp();
		upi.debitLoanEMI();
	}


}
