package com.raystech.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList l = new LinkedList<>();
		l.add("Chew");
		l.add(1);
		l.add("Two");
		l.add("3");
		l.add(5);
		l.add(null);
		l.add("Pal");
		l.addFirst("Nilesh");
		l.addFirst(24);
		l.addFirst("Hukum");
		l.addLast(10);
		l.add(null);
		l.add(5);
		l.add("Chew");
		
		
		System.out.println(l);
		System.out.println(l.getLast()+"\n");
		Iterator i = l.iterator();
		//l.add(13);
		while(i.hasNext()){
			System.out.println(i.next());
			
		}
		
	}

}
