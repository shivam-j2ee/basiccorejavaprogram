package com.raystech.Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet l = new LinkedHashSet<>();
		l.add(1);
		l.add(2);
		l.add("Pal");
		l.add(6.23);
		l.add(null);
		l.add("Chew");
		l.add("Singh");
		l.add("Pal");
		l.add(null);
		
		System.out.println(l);
		
		Iterator i = l.iterator();
		//l.add(10);
		while(i.hasNext()){
			//Integer n = (Integer)i.next();
			System.out.println(i.next());
			
		}
		
	}

}
