// method with return type,without arguments
public class Employee1 {

	
		int id;
		String ename;
		double salary;

		 double incSal() {
			 double bonus = 5000;
			return salary+bonus;
		}

		public static void main(String[] args) {
			Employee1 e = new Employee1();
			e.salary = 50000;
			System.out.println(e.incSal());

		}

}


