package com.wipro.eb.main;

import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;
import com.wipro.eb.service.ConnectionService;

public class EBMain {
	public static void main(String[] args) throws InvalidConnectionException, InvalidReadingException {
		{
			System.out.println(new ConnectionService().generateBill(220,100,"Commercial"));
			}

	}
}
