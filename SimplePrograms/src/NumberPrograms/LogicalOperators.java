
// logical Operator
package NumberPrograms;

public class LogicalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 5;
		// true && true = true
		System.out.println(a<b && a> c);
		
		// true && false  = false
		System.out.println(a< b && a<c);
		
		
		// false && false = false
		System.out.println(a>b && a<c);
		
		// true || true = true
		System.out.println(a<b || a> c);
		
		//true || false = true
		System.out.println(a< b || a<c);
		
		//false || false = false
		System.out.println(a>b || a<c);
	}

}
