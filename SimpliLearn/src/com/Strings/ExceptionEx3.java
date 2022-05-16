// finally block

package com.Strings;

public class ExceptionEx3 {

	public static void main(String[] args) {

		System.out.println("Program Execution Started");
		try {
			int b[] = { 1, 2, 3, 4, 5 };
			b[7] = 50;
		} catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finaly Block");
		}
	}
}
