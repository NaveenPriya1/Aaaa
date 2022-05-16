//single level inheritence


public class Bike1 {
	int speed = 200;

}

class Duke extends Bike1 {
   void DukeSpeed() {
	   System.out.println(speed+150);
   }
}
