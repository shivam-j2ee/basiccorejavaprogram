package extr;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DeQueueExm {

	public static void main(String[] args) {
		
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
	}
}
