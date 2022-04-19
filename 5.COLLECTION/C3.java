package com.raystech.Collection;

import java.util.Comparator;

public class C3 implements Comparator<C3> {

	private String name;
  //private String salary;
    private int salary;
	
	public C3() {	}
	
	
	public C3(String name,int salary) {

	       this.name=name;
	       this.salary=salary;
	}
	
	public int compare(C3 c1,C3 c2){
		
		return ((c1.salary)-(c2.salary));
	}

	public String toString(){
		
		return name+" "+salary;
	}
	
	
}
