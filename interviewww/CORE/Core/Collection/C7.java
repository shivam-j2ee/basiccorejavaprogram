package com.raystech.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C7 {

	public static void main(String[] args) {

		List l = new ArrayList();
		l.add("Hukum");						//		l.add(1);  
		l.add("Pal");							//		l.add(2);
		l.add("Hukum");
		l.add("Nitin");							//		l.add(3);
		l.add("null");
		l.add("Sahu");							//		l.add(4);
		l.add("Kalki");							//		l.add(5);
		l.add("null");
		
		System.out.println(l);

		ListIterator i = l.listIterator();
		
		while(i.hasNext()){
			//Integer n = (Integer)i.next();
			String n = (String)i.next();
			
			if(n.equals("Nitin")){
			 i.remove();
			 
			}else if(n.equals("Hukum")){
				i.add("Kamalesh");
						
		}else if(n.equals("Pal")){
			i.set("Suresh");
			
		}
			
		}
		System.out.println(l);
	}

}
