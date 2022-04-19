package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeComparableTest {

	public static void main(String[] args) {

		EmployeeComparable emp = new EmployeeComparable("Hukum Pal", 24, "66000");
		EmployeeComparable emp1 = new EmployeeComparable("Nilesh Rajput", 27, "20000");
		EmployeeComparable emp2 = new EmployeeComparable("Ankit Singh", 34, "40000");
		EmployeeComparable emp3 = new EmployeeComparable("Prakash Patil", 30, "44000");
		
		List l = new ArrayList<>();
		l.add(emp);
		l.add(emp1);
		l.add(emp2);
		l.add(emp3);
		
		Collections.sort(l);
		Iterator i = l.iterator();
		while(i.hasNext()){
			/*  Object o = i.next();
			System.out.println(o.getName());*/
			
			EmployeeComparable e1 = (EmployeeComparable)i.next();
			System.out.println(e1.getName()+" "+ e1.getSalary()+" "+ e1.getAge());
			
					}
		
	}

}
