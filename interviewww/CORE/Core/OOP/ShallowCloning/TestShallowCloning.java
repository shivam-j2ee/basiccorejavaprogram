package com.raystech.OOP.ShallowCloning;

public class TestShallowCloning {

	public static void main(String[] args)throws CloneNotSupportedException {
	
	   Course c1 = new Course("Maths", "Java");
	   Course c2 = (Course)c1.clone();
	     c2.sub1="C";
	     System.out.println(c2.sub1);
	     c2.sub1="d";
	     System.out.println(c2.sub1);
	     System.out.println(c2.sub2);
	     System.out.println(c1.sub1);
	     System.out.println(c1.sub2);
	   
	}

}
