// Encapulation
public class Employee5 {
	private int id;
	private String ename;
	private double salary;
   
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	} 

	@Override
	public String toString() {
		return "Employee id =" + id +"\n"+"ename = " + ename +"\n"+"salary=" + salary; 
	}

	public static void main(String[] args) {
		Employee5 e1 = new Employee5();
		e1.setId(12);
		System.out.println(e1.getId());
		e1.setEname("Naveen");
		System.out.println(e1.getEname());
		e1.setSalary(25000);
		System.out.println(e1.getSalary());
		System.out.println(e1);
		
	}

}
