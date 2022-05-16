import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		int empno;
		String empname;
		char gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value for Empno");
		empno = sc.nextInt();

		System.out.println("Enter the Value for Empname");
		empname = sc.next();

		System.out.println("Enter the Value for Gender");
		gender = sc.next().charAt(0);

		System.out.println(empno + " " + empname + " " + gender);

	}

}
