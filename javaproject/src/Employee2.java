// without return with arguments
public class Employee2 {

	int empno;
	String empname;
	double salary;

	void incrSalary(double bonus) {
		System.out.println(salary + bonus);
	}

	

	public static void main(String[] args) {
		Employee2 e = new Employee2();
		e.salary = 50000;
		e.incrSalary(5000);

	}


}


