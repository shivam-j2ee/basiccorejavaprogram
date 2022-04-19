package collection;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Deque 
{
	public static void main(String[] args) 
	{
     java.util.Deque d = new ArrayDeque<>();
     d.add(1);
     d.add(2); 
     d.add(3);
     
     System.out.println(d);
     
     Queue q = new PriorityQueue<>();
     q.offer(11);
     q.offer(22);
     
     System.out.println(q);
	}
}
