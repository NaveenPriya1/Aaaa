package com.Exception.ATM;

public class AtmSbi {
public void atmWithdraw(double money) throws InvalidAccountBalanceException {
	int bal = 100000;
	if(money<= bal) {
		System.out.println("Collect your Money Down Here");
		System.out.println("Remaining Account Balance");
		System.out.println(bal-money);
	}
	else {
		throw new InvalidAccountBalanceException("Invalid Account Balance");
		
	}
}
}
