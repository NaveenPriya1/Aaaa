// to check prime number

package NumberPrograms;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("The Prime numbers between 1 and " + n + " are");
		
		// loop through the numbers one/one
		for (int i = 2; i <= n; i++) {
             boolean isPrime = true;
             // to check whether is prime
             for (int j = 2;j<i;j++) {
            	 if(i%j == 0) {
            		 isPrime = false;
            		 break;
            	 }
             }
            if(isPrime) 
            	System.out.print(i+" ");
		}
	}

}
