package com.java.basics;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee3 e1 = new Employee3();
		e1.empno = 11;
		e1.empname = "sai";
		e1.sal = 25000;
		System.out.println(+e1.empno +" " + e1.empname);
		e1.incSal();
		
		Employee3 e2 = new Employee3();
		e1.empno = 12;
		e1.empname = "ram";
		e1.sal = 24000;
		System.out.println(e1.empno +" " + e1.empname);
		e1.incSal();
		
		Employee3 e3 = new Employee3();
		e1.empno = 13;
		e1.empname = "sairam";
		e1.sal = 35000;
		System.out.println(e1.empno +" " + e1.empname);
		e1.incSal();
		
	}

}
