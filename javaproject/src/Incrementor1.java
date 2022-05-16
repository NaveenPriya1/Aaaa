//If we take static before a method . then no need to create an object to access the method.
//We can access it with the class directly



public class Incrementor1 {
   static int counter = 0;
   
   static void increment() {
	   counter++;
	   System.out.println(counter);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Incrementor1.increment();
        Incrementor1.increment();
        Incrementor1.increment();
	}

}
