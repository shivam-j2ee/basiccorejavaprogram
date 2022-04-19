package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class First {

	public static void main(String[] args) {
		
		
		/*Collection c = new ArrayList();
		c.add(12);
		c.add("Hukum");
		c.add(2.5);
		c.add('m');
		c.add(78);
		c.add(true);
		c.add(false);
		
		for(Object o : c)
		System.out.println(o);*/
		
		LinkedList l = new LinkedList<>();

		l.add("teji");
		l.add("AMit");
		l.add("hikanshu");
		l.add("vivek");
		l.add("Aditi");

		System.out.println(l);
		ListIterator itr = l.listIterator();

		while (itr.hasNext()) {

			String s = (String) itr.next();

			if (s.equals("teji")) {

				itr.add("Zameer");
			} else if (s.equals("Aditi")) {

				itr.remove();
			} else if (s.equals("vivek")) {

				itr.set("Manish");
			}

		}

		System.out.println(l);

		while (itr.hasPrevious()) {

			String str = (String) itr.previous();
			System.out.println(str);
		}

		
		
		
	}
	
	
}
