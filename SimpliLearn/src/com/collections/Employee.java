//Arraylist Example

package com.collections;

import java.util.ArrayList;
import java.util.Iterator;



 class Employee {
       int empno;
       String empname;
       
       
	public Employee(int empno, String empname) {
		super();
		this.empno = empno;
		this.empname = empname;
	}


 
	public static void main(String[] args) {
		Employee e1 = new Employee(13, "Naveen");
		Employee e2 = new Employee(14, "Suresh");
		Employee e3 = new Employee(15, "raghav");
		
		//Array of Objects
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(new Employee(143, null));
		System.out.println(al);
		
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());

		
		}
		

	}

}
