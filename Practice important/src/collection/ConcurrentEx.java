package collection;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentEx {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(5);
		
		CopyOnWriteArrayList c = new CopyOnWriteArrayList<>();
		c.addIfAbsent(11);
		c.addIfAbsent(11);
		c.addIfAbsent(13);
		
		c.addAll(al);
		
		ArrayList al1 = new ArrayList<>();
		al1.add(41);
		al1.add(42);
		
		c.addAll(al1);
		
		c.addIfAbsent(41);
		
		System.out.println(c);
		System.out.println();
	}
}

