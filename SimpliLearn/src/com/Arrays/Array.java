package com.Arrays;
import java.util.Arrays;
import java.util.Scanner;

	public class Array{
	public static void main(String[] args) {
	int size;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array");
	size=sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		System.out.println("eneter the value of an array at location "+ i);
		a[i]=sc.nextInt();
	}
	int b[]=new int[size];
	//content copy of one array to other
	System.arraycopy(a, 0, b, 0, a.length);

	for(int j:b) {
		System.out.println(j);
	}


	}
	}



