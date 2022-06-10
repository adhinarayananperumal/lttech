package com.bookmyshow.proxypatternexp;

public class AccountTransactionProxy  implements Transfer{
	
	AccountTransaction accountTransaction = new AccountTransaction();


	@Override
	public String interBankTRansfer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String impsBankTRansfer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String nedtBankTRansfer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String upiBankTRansfer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void debitamount(double emiAmount, String bankAcno) {
		accountTransaction.debitamount(2300, "pnb4567");
		System.out.println("debited successfully");
	}

}
