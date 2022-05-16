package com.Exception.vote;

public class AgeMain {

	public static void main(String[] args) throws InvalidAgeException {
		AgeValidator agevalid = new AgeValidator();
		agevalid.ageValidate(20);

	}

}
