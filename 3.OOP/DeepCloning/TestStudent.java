package com.raystech.OOP.DeepCloning;

public class TestStudent implements Cloneable {

	int id;
	TestCourse course;
	
	public TestStudent(int id) {
 	    this.id=id;
 	    course = new TestCourse("Java", "Maths");
	}
	public Object clone()throws CloneNotSupportedException{
		
		TestStudent ts = (TestStudent)super.clone();
		 ts.course = (TestCourse)course.clone();
		 return ts;		
	}
}
