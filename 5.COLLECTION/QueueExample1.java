package com.raystech.Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample1 {

	public static void main(String[] args) {

		//Queue q = new LinkedList<>();
		  Queue q = new PriorityQueue<>();
		  q.add(1);
		  q.offer(10);
		  q.offer(13);
		  //q.add("three");
		  //q.add("One");
		  q.add(3);
		  q.add(9);
		  q.offer(2);
		  
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q);
		
	}

}
