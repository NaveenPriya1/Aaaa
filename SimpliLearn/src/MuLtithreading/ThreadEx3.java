// wait and notify

package MuLtithreading;

class AtmWithdraw {
	int balance = 100000;
 
	synchronized void  withdraw(int amount) {
		System.out.println("Withdraw Started");
		if(balance > amount) {
			System.out.println();
		}
	}
}

public class ThreadEx3 {

	public static void main(String[] args) {

	}

}
