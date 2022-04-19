package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteranation {

	public static void main(String[] args) {

		List l = new ArrayList<>();
		
		for(int i=1;i<=50;i++){
			
			l.add((int)Math.random()*500);
			//System.out.println(l);
		}
		
		Iterator i = l.iterator();
		while(i.hasNext()){
			Object o = i.next();
			System.out.print(o+" ");
		}
		
		
	}

}
