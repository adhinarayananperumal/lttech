package com.bookmyshow.factoryexp;

public class FactoryCreationForLoan {

	public static Loan getLoan(String loanType) {

		if (loanType.equals("Home")) {
			return new HomeLoanDetailImpl();
		} else if (loanType.equals("Vehicle")) {
			return new VehicleLoanImpl();
		} else if (loanType.equals("Personal")) {
			return new PersonalLoanImpl();
		} else {
			return null;
		}

	}

}
