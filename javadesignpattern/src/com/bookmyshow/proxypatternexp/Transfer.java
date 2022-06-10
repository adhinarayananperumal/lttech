package com.bookmyshow.proxypatternexp;

public interface Transfer {

	String interBankTRansfer();

	String impsBankTRansfer();

	String nedtBankTRansfer();

	String upiBankTRansfer();

	void debitamount(double emiAmount, String bankAcno);

}
