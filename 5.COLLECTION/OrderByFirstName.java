package com.raystech.Collection;

import java.util.Comparator;

public class OrderByFirstName implements Comparator<EmployeeComparator> {

	public int compare(EmployeeComparator e1,EmployeeComparator e2){
		
		return (e1.getfName().compareTo(e2.getfName()));
	}

}
