package com.raystech.Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeImplementation {

	public static void main(String[] args) {

		//Deque d = new ArrayDeque<>();
	    Deque d = new LinkedList<>();
	    d.add("1");
		d.add("null");
		d.add("3");
		d.add("null");
		
		Iterator i = d.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
			
		}
	}

}
