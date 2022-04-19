package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add(10);
		a.add("Hukum");
		a.add(2.434);
		a.add('3');

		System.out.println(a);
		Iterator i = a.iterator();
		a.add(23);
		while(i.hasNext()){
			Object o = i.next();
			System.out.println(o);
			
			
		}
		
	}

}
