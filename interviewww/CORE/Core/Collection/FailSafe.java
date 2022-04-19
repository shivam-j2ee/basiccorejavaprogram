package com.raystech.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafe {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(12);
		v.add("Pal");
		v.add('H');
		v.add(12.233);
		
		System.out.println(v);
		Enumeration e = v.elements();
		v.add(89);
		while(e.hasMoreElements()){
			Object o = e.nextElement();
			System.out.println(o);
			
		}
		
		
		
		
	}

}
