// collections arraylist

package com.collections;

import java.util.ArrayList;
import java.util.Iterator;



public class CollectionsEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(55);
		al.add(5);
		al.add(1);
		System.out.println(al);
		 
		//for loop
		System.out.println("for loop");
		for (int i = 0;i< al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//for each loop
		System.out.println("for each loop");
		for (int x:al) {
			System.out.println(x);
		}
     //iterator
		System.out.println("Iterator");
		Iterator<Integer> j = al.iterator();
			while (j.hasNext());
			System.out.println(j.next());
		
		}
	}


