package com.raystech.OOP.DeepCloning;

public class TestCS {

	public static void main(String[] args) throws CloneNotSupportedException {

		TestStudent ts = new TestStudent(12);
		TestStudent t1 = (TestStudent)ts.clone();
		
		System.out.println(ts.id);
		System.out.println(ts.course.sub1);
		System.out.println(ts.course.sub2);
		
		t1.id=20;
		t1.course.sub1="English";
		
		System.out.println(ts.id);
		System.out.println(t1.id);
		System.out.println(ts.course.sub1);
		System.out.println(t1.course.sub1);
		
	}

}
