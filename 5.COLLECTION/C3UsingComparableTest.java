package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C3UsingComparableTest {

	public static void main(String[] args) {

		C3UsingComparable c1 = new C3UsingComparable();
		
		List l = new ArrayList<>();
		l.add(new C3UsingComparable("Hukum Pal", 40000));
		l.add(new C3UsingComparable("Akhil Jaiswal", 56000));
		l.add(new C3UsingComparable("Jagannath Puri", 20000));
		l.add(new C3UsingComparable("Kamal Jain", 400000));
		l.add(new C3UsingComparable("Chail Joshi", 80000));
		
		
		Collections.sort(l);
		
		for(Object o: l)
		System.out.println(o);
	
	}

}
