package com.raystech.OOP.DeepCloning;

public class TestCourse implements Cloneable {

	String sub1;
	String sub2;
	
	public TestCourse(String sub1,String sub2) {
            this.sub1=sub1;
            this.sub2=sub2;
            System.out.println(sub1+"   "+sub2);
	
	}
	public Object clone()throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
}
