// program to Print REVERSE of N to 1 numbers

package NumberPrograms;

import java.util.Scanner;

public class PrintNums2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i= n;i>=1;i--) {
        	System.out.println(i);
        }
        
	}

}
