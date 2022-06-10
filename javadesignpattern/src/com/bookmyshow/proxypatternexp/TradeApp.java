package com.bookmyshow.proxypatternexp;

public class TradeApp {

	
Transfer accountTransactionProxy = new AccountTransactionProxy();
	
	
	
	void debitLoanEMI(){
		accountTransactionProxy.debitamount(2300, "pnb4567");
	}

	
	public static void main(String[] args) {


		TradeApp tradeApp = new TradeApp();
		 tradeApp.debitLoanEMI();

	}

}
