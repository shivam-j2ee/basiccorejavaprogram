package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class EmployeeComparatorTest {

	public static void main(String[] args) {

		EmployeeComparator e1 = new EmployeeComparator("Hukum","Pal",60000);
		EmployeeComparator e2 = new EmployeeComparator("Nilesh","Travi",40000);
		EmployeeComparator e3 = new EmployeeComparator("Parmar","Singh",70000);
		EmployeeComparator e4 = new EmployeeComparator("Nitin","Rajput",20000);
	
		List l = new ArrayList<>();
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		
		System.out.println(l);
		//Collections.sort(l,new OrderByFirstName());
 		//Collections.sort(l,new OrderByLastName());
		Collections.sort(l,new OrderBySalary());
		
	    Iterator i = l.iterator();
	    while(i.hasNext()){
	    	
	    	//Object o = i.next();
	    	System.out.println(i.next());
	    	
	     /*EmployeeComparable e = (EmployeeComparable)i.next();
	      System.out.println(e);
	      System.out.println(e.getName()+" "+e.getAge()+" " +e.getSalary());*/
	    
	    }
	
	}
}
