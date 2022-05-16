package com.Exception.ATM;

import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) throws InvalidAccountBalanceException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the howmuch money to be withdrawn");
		int money = sc.nextInt();
		AtmSbi atm = new AtmSbi();
		atm.atmWithdraw(money);
	}

}
