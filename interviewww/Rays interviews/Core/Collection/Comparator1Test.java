package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Comparator1Test {

	public static void main(String[] args) {

		
		/*Comparator1 c1 = new Comparator1("Ankit", "Sharma", 25);
		Comparator1 c2 = new Comparator1("Ankit", "Dauda", 30);
		Comparator1 c3 = new Comparator1("Ankit", "Sari", 20);*/
		
		Comparator1 c = new Comparator1();
		
		List l = new ArrayList<>();
		l.add(new Comparator1("Ankit", "Sharma", 25));
		l.add(new Comparator1("Ankit", "Dauda", 30));
		l.add(new Comparator1("Ankit", "Siri", 20));
		
		Collections.sort(l,c);
        Iterator i = l.iterator();
        while(i.hasNext()){
        	Comparator1 s = (Comparator1)i.next();
        	System.out.println(s+" "+s.getAge());
        	//System.out.println(s);
        	
        }
	
		/*for(Object o:l)
		System.out.println(o);*/
	}

}
