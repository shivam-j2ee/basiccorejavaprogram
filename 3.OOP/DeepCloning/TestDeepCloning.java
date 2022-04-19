package com.raystech.OOP.DeepCloning;

public class TestDeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Course c = new Course("JAVA","C");
		Student s = new Student(1, "Hukum", c);
		
		Student s1 = (Student) s.clone();
		
		System.out.println(s1.course.s1);
		s1.course.s1="Maths";
		System.out.println(s1.course.s1);
	}

}
