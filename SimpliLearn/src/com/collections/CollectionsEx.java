// autoboxing and unboxing


package com.collections;

public class CollectionsEx {
public static void main(String[] args) {
	
	/*unboxing
	 converting the wrapper class obj to primary data type */
	Integer i = new Integer(12);
	int j = i;
	System.out.println(j);
	
	/* auto boxing
	 converting the primary data type obj to wrapper class */
	int a = 10;
	Integer b = a;
	System.out.println(b);
}
}
