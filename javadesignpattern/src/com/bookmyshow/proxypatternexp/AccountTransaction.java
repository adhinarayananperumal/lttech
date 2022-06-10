package com.bookmyshow.proxypatternexp;

public class AccountTransaction implements Transfer{

	public String interBankTRansfer() {
		return "success";
	}

	public String impsBankTRansfer() {
		return "success";
	}

	public String nedtBankTRansfer() {
		return "success";
	}

	public String upiBankTRansfer() {
		return "success";
	}

	public void debitamount(double emiAmount, String bankAcno) {
		System.out.println("ok");
	}
}
