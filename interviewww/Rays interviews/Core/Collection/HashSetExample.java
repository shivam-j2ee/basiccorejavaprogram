package com.raystech.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		//HashSet doesn't allow duplicate value and can contain only one null value and it doesn't maintain any order
		// And HashSet is also fail-fast.
		HashSet h = new HashSet<>();
		h.add("");
		h.add("Hukum");
		h.add(null);
		h.add("null");
		h.add(2);
		h.add(2);
		h.add("");
		h.add("Hukum");
		h.add(null);
		
		System.out.println(h);
		
		Iterator i = h.iterator();
		//h.add(12);
		while(i.hasNext()){
			System.out.println(i.next());
			
		}
	}

}
