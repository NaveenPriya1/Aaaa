// abstraction

package com.javap;

 class CalculatorImp extends Calculator {

	 @Override
	void sum(int a, int b) {
		System.out.println(a + b);

	}

	@Override
	void sub(int a, int b) {
		System.out.println(a - b);
	}

	@Override
	void mul(int a, int b) {
		System.out.println(a * b);
	}

	@Override
	void div(int a, int b) {
		System.out.println(a / b);
	}
	

	public static void main(String[] args) {
		CalculatorImp c = new CalculatorImp();
		c.sum(5, 550);
		c.sub(1000, 550);
		c.mul(5, 550);
		c.div(500, 5);
	}

 }

	