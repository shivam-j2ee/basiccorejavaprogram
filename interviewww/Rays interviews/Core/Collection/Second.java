package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Second {

	public static void main(String[] args) {

		Collection c = new ArrayList();
		c.add(12);
		c.add("Hukum");
		c.add(2.5);
		c.add('m');
		c.add(78);
		c.add(true);
		System.out.println(c);
		
		Collection c1 = new ArrayList();
		c1.add(34);
		c1.add("Pal");
		c1.add('c');
		c1.add("B");
		
		c.addAll(c1);
		System.out.println(c);
		System.out.println(c1);
		

		System.out.println(c.retainAll(c1));
		System.out.println(c);
		
		/*for(Object o:c1)

	  System.out.println(o);
		System.out.println(c1.size());
		//System.out.println(c1.containsAll(c));
		System.out.println(c.remove(12));
		System.out.println(c);
		System.out.println(c1.contains(12));
		System.out.println(c1.contains(c));
		System.out.println(c1.contains(34));
		System.out.println(c1.containsAll(c));
		System.out.println(c1.removeAll(c));
		System.out.println(c1.remove(c));
		System.out.println(c1);
		System.out.println(c1.size());
	    //c1.clear();
	    System.out.println(c1);
	    System.out.println(c1.addAll(c));
	    System.out.println(c1.retainAll(c));*/
	    
	}

}
