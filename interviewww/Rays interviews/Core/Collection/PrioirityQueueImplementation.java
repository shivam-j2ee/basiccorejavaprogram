package com.raystech.Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrioirityQueueImplementation {

	public static void main(String[] args) {

		
		//Queue q = new PriorityQueue<>();
		Queue q = new LinkedList<>();
		    q.add("null");
		    q.add(null);
		    q.add(20);
		    q.add("2");
		    q.add("3");
		    q.add(null);
		    q.add("null");
		    
		    
		    System.out.println(q);
		    Iterator i = q.iterator();
		    //q.add(10);
		    while(i.hasNext()){
		    	System.out.println(i.next());
		    	
		    }
		
	}

}
