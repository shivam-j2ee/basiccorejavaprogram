package com.raystech.Collection;

import java.util.Comparator;

public class C2 implements Comparator<C2>{

	
	private String fName;
	private String mName;
	private String lName;
	private Integer age;
	
	
	public C2() {	}
	
	public C2(String fName,String mName,String lName,Integer age) {

	      this.fName=fName;
	      this.mName=mName;
	      this.lName=lName;
	      this.age=age;	    		  
	
	}

	@Override
	public int compare(C2 c1, C2 c2) {

		return ((c1.fName+" "+c1.mName+" "+c1.lName).compareTo(c2.fName+" "+c2.mName+" "+c2.lName));
	}
	
	public String toString(){
		
		return  fName+" "+ mName +" "+ lName +" "+age;
	}
	
	
	
	
}
