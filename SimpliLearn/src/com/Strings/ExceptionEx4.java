//Nested Try Block Try block in Another try block

package com.Strings;

public class ExceptionEx4 {

	public static void main(String[] args) {
		System.out.println("Program Execution Started");
		
		try {
			int b[] = { 1, 2, 5, 8, 9 };
			try {
				b[7] = 50;
			} catch (Exception e) {
				System.out.println(e);
			}
			int i = 40 / 0;
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Program Execution Completed");
	}

}
