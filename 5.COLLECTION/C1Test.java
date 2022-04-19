package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class C1Test {

	public static void main(String[] args) {

		List l = new ArrayList<>();
		C1 cc = new C1();
		l.add(new C1("Nayan","Nick",23));
		l.add(new C1("Monu","Nayan",27));
		l.add(new C1("Mohit","Nayan",25));
		l.add(new C1("Hukum","Pal",30));
		l.add(new C1("Hukum","Parmar",33));
		
		Collections.sort(l,cc);
		System.out.println(cc + " " +l);
		
		for(Object o:l)
		System.out.println(o);
		
		/*Iterator i = l.iterator();
		while(i.hasNext()){
			C1 s = (C1)i.next();
			System.out.println(s);
			
		}*/
	}

}
