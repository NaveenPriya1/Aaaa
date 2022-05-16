//employ salary increment using getters and setters



public class EmpSal {
	private int empId;
	private String name;
	private double sal;

	public EmpSal(int empId, String name, double sal) {
		super();
		this.empId = empId;
		this.name = name;
		this.sal = sal;
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return this.sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double incrMentSal() {

		return sal = sal + sal * 0.1;
	}

	@Override
	public String toString() {
		return " EmpId =" + this.empId +"\n"+ " Name =" + this.name +"\n"+ " Actualsal=" + this.sal +"\n"+ " After Bonas Sal ="
				+ this.incrMentSal();

	}

	public static void main(String[] args) {
		EmpSal e = new EmpSal(1245, "Suresh", 30000);
		e.setName("Geetha");
		System.out.println(e);
		System.out.println("==========================");

		EmpSal e1 = new EmpSal(1244, "Swagath", 35000);
		System.out.println(e1);
		System.out.println("==========================");

		EmpSal e2 = new EmpSal(1345, "john", 20000);
		System.out.println(e2);
		System.out.println("==========================");

	}
}
