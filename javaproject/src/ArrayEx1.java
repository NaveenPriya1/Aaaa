// To print data in the Array,for each,For loop

public class ArrayEx1 {
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 1;
		a[1] = 1;
		a[2] = 1;
		a[3] = 1;
		
		int b[] = new int[] { 2, 3, 4, 5, 6 };

		for (int x : b) {
			System.out.println(x);
		}

		for (int i=0; i<a.length;i++) {
			
		System.out.println(a[i]);
	}

	}}

