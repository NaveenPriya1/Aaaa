package NumberPrograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enther the value of num");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println(n+" "+"Is Even Number");
		}
		else {
			System.out.println(n+" "+"Is Odd Number");
		}

	}

}
