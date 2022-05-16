// Multilevel Inheritance


public class Bike2 {
    int speed = 200;
    
}

class Duke2 extends Bike2{
	void duke2Speed() {
		System.out.println(speed+150);
	}
}
	class Yamaha extends Duke2{
		void yamahaSpeed() {
			System.out.println(speed+200);
		}

} 