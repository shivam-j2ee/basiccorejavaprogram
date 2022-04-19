package com.raystech.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class C6 {
   
	public static void main(String[] args) {

		/*List l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);*/
		
		LinkedList l = new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(null);
		l.add(4);
		l.add(-1);
		l.add(null);
		l.add(2);
		
		/*l.add("ABC");
		l.add("KLa");
		l.add("HSN");
		l.add("  ");
		l.add("JNJ");*/
		
		System.out.println(l);
		
		int a = l.size();
		
		ListIterator i = l.listIterator(a);
		while(i.hasPrevious()){
			System.out.print(i.previous()+" ");
			
		}
		
	}

}
