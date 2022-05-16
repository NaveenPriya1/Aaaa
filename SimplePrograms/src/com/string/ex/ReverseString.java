package com.string.ex;

public class ReverseString {

	public static void main(String[] args) {
		
          String n = "Naveen";
          
          for(int i =n.length()-1;i>=0;i--) {
        	  System.out.print(n.charAt(i));
          }
          System.out.println();
          System.out.println(n.charAt(0));
          System.out.println(n.endsWith("n"));
          System.out.println(n.trim());
          System.out.println(n.codePointAt(0));
          System.out.println(n.codePointBefore(2));
          System.out.println(n.codePointCount(0, 2));
          System.out.println(n.concat(n));
          System.out.println(n.toLowerCase());
          System.out.println(n.toUpperCase());
          System.out.println(n.isEmpty());
          System.out.println(n.contains("en"));
          System.out.println(n.intern());
         
	}

}
