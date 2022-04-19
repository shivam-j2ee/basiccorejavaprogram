package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C10 {

	public static void main(String[] args) {
		
    //List allow duplicate element and null value to be inserted
		List l = new ArrayList();
		l.add(1);
		l.add(null);
		l.add(null);
		l.add(4);
		l.add(1);
		
		System.out.println(l);
		l.add(3, 40);
		System.out.println(l);
		ListIterator i = l.listIterator();
		l.add(10);
		//Iterator  i = l.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
			/*Integer n = (Integer)i.next();
			if(n.equals(3)){
				
				i.remove();
			}*/
		}
		//System.out.println(l);
	}

}
