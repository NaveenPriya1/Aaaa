package com.javap;

public class PerEmp extends Employee{
    String name;
    int eid;
    double salary;
    
	
	public  PerEmp(String name, int eid,double salary) {
		super();
		this.name = name;
		this.eid = eid;
		this.salary = incSal(salary);
		
	}


	@Override
	public String toString() {
		return "PerEmp name=" + name +"\n"+ " eid=" + eid +"\n"+ " salary=" + salary + "";
	}
    
    
}
class TempEmp extends Employee{
	 String name;
	    int eid;
	    double salary;
	    
		public TempEmp(String name, int eid,double salary) {
			super();
			this.name = name;
			this.eid = eid;
			this.salary = incSal(salary);
		}

		@Override
		public String toString() {
			return "TempEmp name=" + name +"\n"+ " eid=" + eid +"\n"+ " salary=" + salary + "";
		}
		
}


