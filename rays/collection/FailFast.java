package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add("one");
		al.add("two");
		al.add("three");
		
		Iterator it = al.iterator();
		/*al.remove("one");
		al.add("four");*/
		it.remove();
		while(it.hasNext()) {
			
			Object o = it.next();
			System.out.println(o);
			
		}
		
	}

}