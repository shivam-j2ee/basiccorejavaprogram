package com.raystech.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetTreeSetLinkedHashSet {

	public static void main(String[] args) {

		HashSet h = new HashSet<>();
		
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		
		System.out.println(h);
		
		SortedSet s = new TreeSet<>();
		
		s.add("3");
		s.add("2");
		s.add("1");
		s.add("4");
		
		System.out.println(s);
		
		Set s1 = new LinkedHashSet<>();
		
		s1.add("Hukum");
		s1.add("Ankit");
		s1.add("Nilesh");
		s1.add("Pankaj");
		
		System.out.println(s1);
	}

}
