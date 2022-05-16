//Control statements

package NumberPrograms;

import java.util.Scanner;

public class IfElseCondition {

	public static void main(String[] args) {
		int j=18;
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}
		else if(age<18) {
			System.out.print("You have to wait another ");
			System.out.print(18-age);
			System.out.println(" years to Became a voter");
		}
		
		else {
			System.out.println("You are not eligible to vote");
		}
		
	}
	

}
