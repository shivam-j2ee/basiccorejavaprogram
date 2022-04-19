package com.raystech.Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class UseListIterator {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		  l.add("Ankit");
		  l.add("Pyush");
		  l.add("Aayush");
		  l.add("Prakash");
		  l.add("Monu");
		
		
		System.out.println(l);
		
		ListIterator  i = l.listIterator(l.size());
		
		/*while(i.hasNext()){
			String s = (String)i.next();
			System.out.println(s);
			if(s.equals("Aayush")){
				i.remove();
				
			}
			else if(s.equals("Monu")){
				i.add("Sonu");
				
			}
			else if(s.equals("Ankit")){
				i.set("Kalki");
				
			}
		   
		}	
			System.out.println(l);*/
			while(i.hasPrevious()){
				//String s1 = (String)i.previous();
				System.out.println(i.previous());
				
			}

	}
		
	}

