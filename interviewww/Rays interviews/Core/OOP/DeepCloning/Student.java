package com.raystech.OOP.DeepCloning;

public class Student implements Cloneable{

	int id;
	String name;
	Course course;
	public Student(int id,String name,Course course) {
		
		this.id=id;
		this.name=name;
		this.course=course;
		
	}
	public Object clone()throws CloneNotSupportedException {
		
          Student  s2 = (Student)super.clone();
          s2.course = (Course)course.clone();
	  return s2;
	}
}
