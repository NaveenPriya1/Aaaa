package MuLtithreading;

 class ThreadEx extends Thread{
	public void run() {
		for (int i = 0;i<9;i++) {
			System.out.println(i);
		}
	}
 }

	public class PrintNums{
	public static void main(String[] args) {
		ThreadEx num = new ThreadEx();
		num.start();

	}

}
