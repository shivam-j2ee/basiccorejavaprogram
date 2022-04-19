package com.raystech.Collection;

import java.util.Comparator;

public class ComparatorEx implements Comparator{


		public int compare(Object o1,Object o2){
			
			String s = o1.toString();
			String s1 = o2.toString();
			
			int a = s.length();
			int b = s1.length();
			
			if(a>b) return +1;
			else if(b>a) return -1;
			else return s.compareTo(s1);
			
		}
		
		

}
