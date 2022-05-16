// to sort array and print nth max value and nth minimum value

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the of the Array");
		size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the value of array at location" + i);
			a[i] = sc.nextInt();
		}
		for (int x : a) {
			System.out.println(x);
		}
		//sorted array
      Arrays.sort(a);
      System.out.println("enter the nth max and min value");
      int n=sc.nextInt();
      System.out.println("the nth min value is "+a[n-1]+" the nth max value is "+a[size-n]);
      // 0 1 2 3 4 5 
      // 1 2 3 4 5 6  3rd max    L-6 - n


	}

}
