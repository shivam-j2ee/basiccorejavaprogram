package com.raystech.Collection;

import java.util.Comparator;

public class C1 implements Comparator<C1> {

	private String fName;
	private String lName;
	private Integer age;
	
	
	public C1() {	}
	
	public C1(String fName,String lName,Integer age) {

	      this.fName=fName;
	      this.lName=lName;
	      this.age=age;	    		  
	
	}

	@Override
	public int compare(C1 c1, C1 c2) {

		return ((c1.fName+" "+c1.lName).compareTo(c2.fName+" "+c2.lName));
	}
	
	public String toString(){
		
		return  fName+" "+ lName +" "+age;
	}
	
	
}
