package com.raystech.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class C9 {

	public static void main(String[] args) {

		Vector v = new Vector<>();
		v.add(1);
		v.add(null);
		v.add(2);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(null);
		
		System.out.println(v);
		
		Enumeration e = v.elements();
	  
		v.add(10);
		while(e.hasMoreElements()){
			System.out.print(e.nextElement()+" ");
			
		}
		
	}

}
