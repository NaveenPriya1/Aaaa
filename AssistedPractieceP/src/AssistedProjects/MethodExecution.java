package AssistedProjects;

public class MethodExecution {
	
	public int multiplyNumbers(int i,int j) {
		int z = i*j;
		return z;
	}

	public static void main(String[] args) {
		
        MethodExecution mn = new MethodExecution();
        int ans = mn.multiplyNumbers(29, 31);
        System.out.println("Multiplication of numbers is : "+ans);
        
	}

}
