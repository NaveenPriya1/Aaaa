// Single level inheritance
public class Bike {
	int speed = 200;

}

class R15 extends Bike {
	

	void runR15() {
		System.out.println(speed);
	}

	public static void main(String[] args) {
		R15 r = new R15();
		r.runR15();

	}

}
