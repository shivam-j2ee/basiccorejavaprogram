package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class FailSafe1 {

	public static void main(String[] args) {

		Vector v = new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		
		Enumeration e = v.elements();
		v.add(5);
		while(e.hasMoreElements()){
			Object o = e.nextElement();
			System.out.println(o);
		}	
		
	}

}
