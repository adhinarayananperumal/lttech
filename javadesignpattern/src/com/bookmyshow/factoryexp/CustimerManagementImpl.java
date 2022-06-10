package com.bookmyshow.factoryexp;

public class CustimerManagementImpl {
	
	
	public static void main(String[] args) {
		
		Loan homeLoan = FactoryCreationForLoan.getLoan("Home");
		System.out.println(homeLoan.getLoanAmt());
		
	}

}
