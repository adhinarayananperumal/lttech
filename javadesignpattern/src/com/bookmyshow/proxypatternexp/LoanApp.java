package com.bookmyshow.proxypatternexp;

public class LoanApp {

	Transfer accountTransactionProxy = new AccountTransactionProxy();

	void debitLoanEMI() {
		accountTransactionProxy.debitamount(2300, "pnb4567");
	}

	public static void main(String[] args) {

		LoanApp loanApp = new LoanApp();
		loanApp.debitLoanEMI();
	}

}
