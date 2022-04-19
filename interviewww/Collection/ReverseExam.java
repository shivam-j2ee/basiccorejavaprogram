package extr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseExam {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		System.out.println(al);
		
/*Collections.reverse(al);
		System.out.println(al);
*/
		int size = al.size();
		ListIterator it = al.listIterator(size);
		while (it.hasPrevious()) {

			Object o = it.previous();
			System.out.println(o);
		}
		
	}

}
