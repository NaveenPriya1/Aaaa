package AssistedProjects;

public class TypeCasting {

	public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Conversion");
		 char a = 'A';
		 System.out.println("value of a is: "+a);
		 
		 int b = a;
		 System.out.println("value of b is: "+b);
		 
		 float c = a;
		 System.out.println("value of c is: "+c);
		 
		 long d = a;
		 System.out.println("value of d is: "+d);
		 
		 double e = a;
		 System.out.println("value of e is: "+e);
		 
		 System.out.println("\n");
		 
		 //Explicit conversion
		 System.out.println("Explicit conversion");
		 double x = 60.60;
		 System.out.println("Value of x is: "+x);
		 
		 int y = (int) x;
		 System.out.println("Value of y is: "+y);
		 
		 float z = (float) x;
		 System.out.println("Value of z is: "+z);
		 
		 byte s = (byte) x;
		 System.out.println("Value of s is: "+s);
		 
		 char t = (char) x;
		 System.out.println("Value of t is: "+t);
		 

	}

}
