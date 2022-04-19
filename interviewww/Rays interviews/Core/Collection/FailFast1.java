package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast1 {

	public static void main(String[] args) {

		List l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		Iterator i = l.iterator();
		l.add(5);
		while(i.hasNext()){
			Object o = i.next();
			System.out.println(o);
		}
		
	}

}
