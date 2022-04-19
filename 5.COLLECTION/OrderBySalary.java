package com.raystech.Collection;

import java.util.Comparator;

public class OrderBySalary implements Comparator<EmployeeComparator> {

	public int compare(EmployeeComparator e1,EmployeeComparator e2){
		
		
		return (e1.getSalary().compareTo(e2.getSalary()));
		/*return (e1.getSalary()-(e2.getSalary()));*/
		
	}
	
	
}
