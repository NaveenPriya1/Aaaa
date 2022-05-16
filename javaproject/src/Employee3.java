// without return,without arguments
public class Employee3 {



int empno;
String empname;
double salary;

void incrSalary() {
	double bonus = 5000;
	System.out.println(salary + bonus);
}



public static void main(String[] args) {
	Employee3 e = new Employee3();
	e.salary = 50000;
	e.incrSalary();

}


}
