package trial.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseCollection {
	public static void main(String[] args) {
		

	ArrayList al=new ArrayList();
	al.add(1);
	al.add(2);
	al.add(3);
	System.out.println(al);
	
	/*Collections.reverse(al);
	System.out.println(al);
	//or...
	*/
	int size=al.size();
	ListIterator li=al.listIterator(size);
	while(li.hasPrevious()) {
		Object o=li.previous();
		System.out.println(o);
	}
	
}}
