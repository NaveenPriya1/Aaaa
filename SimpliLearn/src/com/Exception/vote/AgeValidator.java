package com.Exception.vote;

public class AgeValidator {
	
	public void ageValidate(int age) throws InvalidAgeException {
		if (age>= 18) {
			System.out.println("You Have the right to Vote");
		}
		else {
			throw new InvalidAgeException("Your ge is <18 You have no right to vote");
		}
	}

}
