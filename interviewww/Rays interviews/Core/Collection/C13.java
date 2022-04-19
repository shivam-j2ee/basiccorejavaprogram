package com.raystech.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C13 {

	public static void main(String[] args) {

		
		List l = new ArrayList();
		l.add("ABC");
		l.add("Ankit");
		l.add("Nitin");
		l.add("XYZ");
		l.add("Rakesh");
		
		System.out.println(l);
		ListIterator i = l.listIterator(l.size());
		while(i.hasPrevious()){
			System.out.println(i.previous());			
			
		}		
		
	}

}
