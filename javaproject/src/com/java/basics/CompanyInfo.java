package com.java.basics;

public class CompanyInfo {
	int id;
	String ename;
	static String compname = "Infosys";

	public void change() {
		this.compname = "TCS";
	}

	CompanyInfo(int id, String ename) {
		this.id = id;
		this.ename = ename;

	}

	public static void main(String[] args) {
		CompanyInfo c1 = new CompanyInfo(11, "Naveen");
		System.out.println(" id is " + c1.id + " ename is " + c1.ename + " compname is " + c1.compname);
        System.out.println();
		
		CompanyInfo c2 = new CompanyInfo(12, "Suresh");
		System.out.println(" id is " + c2.id + " ename is " + c2.ename + " compname is " + c2.compname);
		System.out.println();
		
		CompanyInfo c3 = new CompanyInfo(13, "Raina");
		System.out.println(" id is " + c3.id + " ename is " + c3.ename + " compname is " + c3.compname);
		System.out.println();
	}

}
