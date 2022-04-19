package com.raystech.OOP.Inheritance;

public class TestSC {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.setColor("Yellow");
		c.setBorderwidth(12);
		c.setRadius(5);
		
		System.out.println(c.getColor());
		System.out.println(c.getBorderwidth());
		System.out.println(c.getRadius());
		System.out.println(c.area());
		
		
		Shape s = new Circle();
		s.setColor("Red");
		s.setBorderwidth(10);
		//s.setRadius(7);
		
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());
		//System.out.println(s.getRadius());
		//System.out.println(s.area());
		
	}

}
