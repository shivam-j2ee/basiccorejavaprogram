package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C8 {

	public static void main(String[] args) {

		List l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		System.out.println(l);
		Iterator i = l.iterator();
		l.add(10);
		while(i.hasNext()){
			System.out.println(i.next());
			
		}
		
		
	}

}
