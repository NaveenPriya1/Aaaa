// ArrayIndexOutOfBoundException

package com.Strings;

public class ExceptionEx {

	public static void main(String[] args) {
		System.out.println("Program Execution Started");
		try {
			int a[] = {1,2,3,4,5};
			a[7] = 50;
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Program Execution Completed");
	}

}
