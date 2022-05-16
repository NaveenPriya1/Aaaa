package com.javap;

public interface Calculator21 {

	void div(int x, int y);

	void mul(int x, int y);

}
class ImpCalculator implements Calculator1,Calculator21{

	@Override
	public void div(int x, int y) {
		System.out.println(x/y);
		
	}

	@Override
	public void mul(int x, int y) {
		System.out.println(x*y);
	}

	@Override
	public void sum(int x, int y) {
		System.out.println(x+y);
	}

	@Override
	public void sub(int x, int y) {
	System.out.println(x-y);	
	}
	
}
