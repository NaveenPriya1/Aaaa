
public class Ruf {
	 private double empsalary;
	    void incrsalary()
	    {   double a =5000;
	        System.out.println(empsalary+a);
	    }
	    
	    
	    public int getEmpno() {
	        return empno;
	    }
	    public void setEmpno(int empno) {
	        this.empno = empno;
	    }
	    public String getEmpname() {
	        return empname;
	    }
	    public void setEmpname(String empname) {
	        this.empname = empname;
	    }
	    public double getEmpsalary() {
	        return empsalary;
	    }
	    public void setEmpsalary(double empsalary) {
	        this.empsalary = empsalary;
	    }
	    
	}
	public class first {
	public static void main(String[] args) {
	    Employee e = new Employee();
	    e.setEmpno(101);
	    e.setEmpname("Raju");
	    e.setEmpsalary(45000);
	    
	    e.incrsalary();
	    
	    Employee e1 = new Employee();
	    e1.setEmpno(102);
	    e1.setEmpname("Ravi");
	    e1.setEmpsalary(50000);
	    
	    
	    e1.incrsalary();
	    Employee e2 = new Employee();
	    e2.setEmpno(103);
	    e2.setEmpname("Shyam");
	    e2.setEmpsalary(550
}
