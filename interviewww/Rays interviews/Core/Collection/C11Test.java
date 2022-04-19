package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C11Test {

	public static void main(String[] args) {

		C11 c = new C11();
		List l = new ArrayList();
		l.add(new C11("Hukum","Pal",23000));
		l.add(new C11("Nilesh","Singh",40000));
		l.add(new C11("Sandeep","Chew",60000));
		l.add(new C11("Lovkesh","Gaur",80000));
		l.add(new C11("Ram","Patil",20000));
		
		Collections.sort(l);
		for(Object o:l)
		System.out.println(o);
	}

}
