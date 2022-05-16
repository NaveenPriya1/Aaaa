// Call by value

package AssistedProjects;

public class CallMethod {
   
	int val = 150;
	
	int operation(int val) {
		return (val) = val*10/100;
	}
   
	public static void main(String[] args) {
		CallMethod cm = new CallMethod();
		System.out.println("Before operation value is"+cm.val);
		cm.operation(100);
		System.out.println("After operation value is"+cm.val);

	}

}
