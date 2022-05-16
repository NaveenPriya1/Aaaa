// Inheritance implements Calculator1, Calculator21,multiple inheritence

package com.javap;

public class Inheritance implements Calculator1, Calculator21 {

	@Override
	public void div(int x, int y) {
		System.out.println(x / y);
	}

	@Override
	public void mul(int x, int y) {
		System.out.println(x * y);
	}

	@Override
	public void sum(int x, int y) {
		System.out.println(x + y);
	}

	@Override
	public void sub(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x - y);
	}

	public static void main(String[] args) {
		
	}
}
