package com.javap;

public class Employee9 extends Person {
	private double annSalary;
	private int eJoinD;
	private String niNum;

	public Employee9(String name, double annSalary, int eJoinD, String niNum) {
		super(name);
		this.annSalary = annSalary;
		this.eJoinD = eJoinD;
		this.niNum = niNum;
	}

	public double getAnnSalary() {
		return annSalary;
	}

	public void setAnnSalary(double annSalary) {
		this.annSalary = annSalary;
	}

	public int geteJoinD() {
		return eJoinD;
	}

	public void seteJoinD(int eJoinD) {
		this.eJoinD = eJoinD;
	}

	public String getNiNum() {
		return niNum;
	}

	public void setNiNum(String niNum) {
		this.niNum = niNum;
	}

	@Override
	public String toString() {
		return "name=" + name + " annSalary=" + annSalary + ", eJoinD=" + eJoinD + ", niNum=" + niNum;
	}

}
