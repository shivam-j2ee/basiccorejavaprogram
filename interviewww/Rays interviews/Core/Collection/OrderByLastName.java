package com.raystech.Collection;

import java.util.Comparator;

public class OrderByLastName implements Comparator<EmployeeComparator> {

	
	@Override
	public int compare(EmployeeComparator e1, EmployeeComparator e2) {

		return (e1.getlName().compareTo(e2.getlName()));
	}
	
	
}
