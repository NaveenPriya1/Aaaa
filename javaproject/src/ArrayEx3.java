// Scanner input array then print the array

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		size = sc.nextInt();
		int a[] = new int[size];
		for(int i = 0;i<a.length;i++) {
			System.out.println("Enter the value of array at Location"+i);
			a[i] = sc.nextInt();
		}
		for (int x:a) {
			System.out.println(x);
		}
		

		
	}

}
