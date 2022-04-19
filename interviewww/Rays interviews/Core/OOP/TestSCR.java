package com.raystech.OOP;

public class TestSCR {

	
	public static void main(String[] args) {
		
		Shape s = new Shape();
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		
		s.show();
		c.show();
		r.show();
		
		
		Shape s1 = new Circle();
		Shape s2 = new Rectangle(); 
		
		s1.show();
		s2.show();
		
		Shape s3 = new Circle();
		Circle c1 = (Circle)s3;
		//Rectangle r1 = (Rectangle)new Shape();   //It gives runtime error Not compile time

		c1.show();
		//r1.show();
		
	}
	
	
}
