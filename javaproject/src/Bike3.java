// Hierarchical Inheritance:

public class Bike3 {
int speed = 200;
}

class Duke3 extends Bike3{
	void dukeSpeed() {
		System.out.println(speed+100);
	}
}
class Yamaha3 extends Bike3{
	void yamahaSpeed() {
		System.out.println(speed+200);
	}
}
