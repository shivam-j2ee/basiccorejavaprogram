package com.raystech.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TimeTakenByArrayListAndHashSet {

	public static void main(String[] args) {

		
		List l = new ArrayList<>();
		Set  s = new HashSet<>();
		
		long start = System.nanoTime();
		for(int i=1;i<=50;i++){
			
		l.contains((int)Math.random()*10000);
			
		}
		long end = System.nanoTime();
		
		long start1 = System.nanoTime();
		for(int i=1;i<=50;i++){
			
		s.contains((int)Math.random()*10000);
			
		}
		long end1 = System.nanoTime();
		
		System.out.println("Time Taken By ArrayList " +(end-start));
		System.out.println("Time Taken By HashSet " +(end1-start1));
	}

}
