package com.raystech.Collection;

import java.util.Comparator;

public class C11 implements Comparable<C11> {

	private String fName;
	private String lName;
	private int salary;
	
	public C11() {	}
	
	
	public C11(String fName,String lName,int salary) {

	    this.fName=fName;
	    this.lName=lName;
	    this.salary=salary;
	
	}
	public int compareTo(C11 c1){
		  return (salary-c1.salary);
	}
	
	public String toString(){
		
		return fName+" "+lName+" "+ salary;
	}
	
}
