package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class C3Test {

	public static void main(String[] args) {
   
		 C3 c = new C3();
		 List l = new ArrayList<>();
		 l.add(new C3("Nayan Chain",50900));
		 l.add(new C3("Dileep Gaur",45500));
		 l.add(new C3("Deepak Parmar",400000));
		 l.add(new C3("Ankit Hudda",20000));
		 l.add(new C3("Manil Jain",60900));
		 
		Collections.sort(l,c);
		
		/*for(Object o:l)
	   System.out.println(o);*/
	
		Iterator i = l.iterator();
		while(i.hasNext()){
			C3 c1 = (C3)i.next();
			System.out.println(c1);			
			
		}
		
		
	}

}
