// Single threading

package MuLtithreading;

class PrintNum2{
	public void run() {
		p.oddser();
		p.evenser();
	}
	
	public void oddser() {
		for(int i =1; i <9;i++) {
			System.out.println(i);
		}
	}
	
	public void evenser() {
		for (int i =2;i<9;i++) {
			System.out.println(i);
		}
	}
}
public class ThreadEx2 {

	public static void main(String[] args) {
		PrintNum2 p = new PrintNum2();
		p.run();

	}

}
