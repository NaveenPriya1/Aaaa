package com.calculator.java;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		char operator;
		Double number1, number2, result;

		// create an object of Scanner class
		Scanner input = new Scanner(System.in);

		boolean b = true;
		while (b) {
			// ask users to enter operator
			System.out.println("Calculator is Running.....");
			System.out.println("Choose an operator: +, -, *, or /");
			System.out.println("Enter 'c' to close Calculator.");
			
			operator = input.next().charAt(0);

			// ask users to enter numbers

			switch (operator) {

			// performs addition between numbers
			case '+':
				System.out.println("Enter first number");
				number1 = input.nextDouble();

				System.out.println("Enter second number");
				number2 = input.nextDouble();
				result = number1 + number2;
				System.out.println(number1 + " + " + number2 + " = " + result);
				System.out.println();
				break;

			// performs subtraction between numbers
			case '-':
				System.out.println("Enter first number");
				number1 = input.nextDouble();

				System.out.println("Enter second number");
				number2 = input.nextDouble();

				result = number1 - number2;
				System.out.println(number1 + " - " + number2 + " = " + result);
				System.out.println();
				break;

			// performs multiplication between numbers
			case '*':
				System.out.println("Enter first number");
				number1 = input.nextDouble();

				System.out.println("Enter second number");
				number2 = input.nextDouble();
				result = number1 * number2;
				System.out.println(number1 + " * " + number2 + " = " + result);
				System.out.println();
				break;

			// performs division between numbers
			case '/':
				System.out.println("Enter first number");
				number1 = input.nextDouble();

				System.out.println("Enter second number");
				number2 = input.nextDouble();
				result = number1 / number2;
				System.out.println(number1 + " / " + number2 + " = " + result);
				System.out.println();
				break;

				
				// To stop Calculator
			case 'c':

				System.out.println("Calculator Stoped");
				b = false;
				break;

			default:
				System.out.println("Invalid operator!");
				System.out.println();
				break;

			}

		}
	}
}