package com.bookmyshow.factoryexp;

public class PaymentManagementImplCli {

	public static void main(String[] args) {
		
		Loan homeLoan = FactoryCreationForLoan.getLoan("Home");

		System.out.println(homeLoan.getLoanAmt());
	}

}
