package com.raystech.Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseElement {

	public static void main(String[] args) {
		
	     ArrayList a = new ArrayList<>();
	     a.add("Hukum");
	     a.add(null);
	     a.add(3);
	     a.add(4);
	
         ListIterator l = a.listIterator(a.size());	     
	     while(l.hasPrevious()){
	    	 System.out.println(l.previous());
	    	     	 
	    	 
	     }		
	}		
}
