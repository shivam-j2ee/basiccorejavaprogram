package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorTest1 
{
	public static void main(String[] args) 
	{
     ComparatorEmployee c1 = new ComparatorEmployee("Ram", "Sharma");
     ComparatorEmployee c2 = new ComparatorEmployee("Ram", "Verma");
     ComparatorEmployee c3 = new ComparatorEmployee("Ajay", "Dubey");
     ComparatorEmployee c4 = new ComparatorEmployee("vijay", "Gupta");
     
     ArrayList a = new ArrayList<>();
     a.add(c1);
     a.add(c2);
     a.add(c3);
     a.add(c4);
     
     ComparatorOrderByFName com = new ComparatorOrderByFName();
     Collections.sort(a, com);
     
     Iterator it = a.iterator();
     
		while (it.hasNext()) {
			ComparatorEmployee e = (ComparatorEmployee) it.next();
			System.out.println(e);
		}
		
		System.out.println();
		
		for (Object object : a) {
			System.out.println(object);
		}
	}
}
