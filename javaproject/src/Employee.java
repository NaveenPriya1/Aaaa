// with return type,arguments
public class Employee {
	int id;
	String ename;
	double salary;

	public double incSal(double bonus) {
		return salary + bonus;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.salary = 50000;
		System.out.println(e.incSal(5000));

	}

}
