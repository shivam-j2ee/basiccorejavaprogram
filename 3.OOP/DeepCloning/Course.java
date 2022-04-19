package com.raystech.OOP.DeepCloning;

public class Course implements Cloneable {

	String s1;
	String s2;
	
	 public Course(String s1,String s2) {
		 
		 this.s1=s1;
		 this.s2=s2;
	}
	 public Object clone()throws CloneNotSupportedException {
		
		 return super.clone();
	}
	

}
