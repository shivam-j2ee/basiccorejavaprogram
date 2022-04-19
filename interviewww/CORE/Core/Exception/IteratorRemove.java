package com.raystech.Exception;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(1);
		al.add(2);
		System.out.println(al);
		Iterator itr=al.iterator();
		
		while(itr.hasNext()){
			Object o=itr.next();
			
			if(o.equals(2)){
				itr.remove();
			}
			System.out.println(al);
		}
	}
	
}
