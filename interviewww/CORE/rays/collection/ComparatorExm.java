package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorExm {
	
	public static void main(String[] args) {
		
		ComparatorEmployee e1 = new ComparatorEmployee("ram", "kumar");
		ComparatorEmployee e2 = new ComparatorEmployee("shyam", "patidar");
		ComparatorEmployee e3 = new ComparatorEmployee("shubham", "rao");
		ComparatorEmployee e4 = new ComparatorEmployee("shubham", "singh");
		
		ArrayList l = new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		
		OrderByFirstName name = new OrderByFirstName();
		Collections.sort(l, name);
		
		Iterator it = l.iterator();
		
		while(it.hasNext()) {
			ComparatorEmployee e = (ComparatorEmployee) it.next();
			System.out.println(e);
		}
		
		
	}

}
