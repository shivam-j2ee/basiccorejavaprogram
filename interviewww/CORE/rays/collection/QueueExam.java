package in.co.rays.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExam {
	
	public static void main(String[] args) {

		Queue q = new PriorityQueue();
		
		/*q.add("one");
		q.add("two");
		q.add("Three");
		q.add("four");
		q.add("sevenn");
		q.add("eb");
		q.add("tnmtk");*/
		q.add(3);
		q.add(12);
		q.add(15);
		q.add(1);
		q.add(5);
		
		System.out.println(q);
		//System.out.println(q);
		q.remove(2);
		System.out.println(q);
		
		System.out.println(q.contains(3));
		System.out.println(q.peek());
		System.out.println(q.element());
		
		for (int i = 0; i <= 10; i++) {
			q.offer(i);
		}
		System.out.println(q.poll());
		
	//Deque	
		Deque<String> d = new LinkedList<String>();
		
		d.addFirst("shubham");
		d.add("kumar");
		d.addLast("chaurasia");
		
		System.out.println(d);
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		System.out.println(d.removeLast());
		System.out.println(d.contains(2));
		
		Iterator<String> a=d.iterator();
		
		while(a.hasNext()){
			System.out.println(a.next());
		}
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
		
		//ArrayDeque
		
		Deque r = new ArrayDeque<>();
		
		r.add("one");
		r.add("two");
		r.add("Three");
		r.addFirst("four");
		r.addLast("five");
		
		System.out.println(r);

	}

}
