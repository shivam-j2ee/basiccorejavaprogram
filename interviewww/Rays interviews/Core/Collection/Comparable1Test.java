package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Comparable1Test {

	public static void main(String[] args) {

		List l = new ArrayList<>();
		Comparable1 c = new Comparable1();
		l.add(new Comparable1(104,"Hukum","Pal"));
		l.add(new Comparable1(103,"Nilesh","Singh"));
		l.add(new Comparable1(101,"Monu","Nick"));
		l.add(new Comparable1(105,"Harish","Harsh"));
		
		Collections.sort(l);
		
		for(Object o:l)
		System.out.println(o);
	
	
	    /* Iterator i = l.iterator();
	     while(i.hasNext()){
	    	 Comparable1 c1 = (Comparable1)i.next();
	    	 System.out.println(c1);    	 
	    	 
	     }*/
	  
	
	}

}
