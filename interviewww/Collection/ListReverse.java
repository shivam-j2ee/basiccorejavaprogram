package extr;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListReverse {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		for(int i=1; i<=10; i++) {
			
			list.add(i);
		}
		
		System.out.println(list);
		
		int size = list.size();
		
		ListIterator it = list.listIterator(size);
		
		while(it.hasPrevious()) {
			
			Object o = it.previous();
			System.out.print(o+", ");
			
		}
		
	}

}
