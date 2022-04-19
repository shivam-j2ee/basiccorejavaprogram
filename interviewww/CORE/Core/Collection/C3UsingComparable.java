package com.raystech.Collection;

public class C3UsingComparable implements Comparable<C3UsingComparable> {

	private String name;
   //private String salary;
	private int salary;
	
	
	public C3UsingComparable() { }
	
	public C3UsingComparable(String name,int salary) {

	             this.name=name;
	             this.salary=salary;
	
	}
	
	public int compareTo(C3UsingComparable c1){
		
		return ((salary)-(c1.salary));
	}
	
	public String toString(){
		
		return name+" "+salary;
		
	}

}
