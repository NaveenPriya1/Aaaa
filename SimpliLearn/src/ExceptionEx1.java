//NestedTry Block(try block in another try block)
public class ExceptionEx1 {

	public static void main(String[] args) {
		System.out.println("hi");
		try {
			int b[]= {2,3,4,5,6};
			try {
			b[7]=50;
			}
			catch (Exception e) {
				
			System.out.println(e);
			}
		int a=50/0;
		}
		catch (Exception e) {
			
			System.out.println(e);
		}
		System.out.println("hello");
		
	}
	

		

	}


