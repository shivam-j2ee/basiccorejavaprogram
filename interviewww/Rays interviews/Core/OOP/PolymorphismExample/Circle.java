package com.raystech.OOP.PolymorphismExample;

public class Circle extends ShapeMethodOverridingUsingAbstractClass{

	double radius=2;
	public double area(){
		double r=3.14*radius*radius;
		return r;
		
	}
	public static void main(String[] args) {
		
		//ShapeMethodOverridingUsingAbstractClass s = new Circle();
		
		//Circle c = new Circle();
		//System.out.println(c.area());
		
		Circle c1 = new Circle();
		ShapeMethodOverridingUsingAbstractClass s = c1;
		//ShapeMethodOverridingUsingAbstractClass s1 = (ShapeMethodOverridingUsingAbstractClass)c1;
		System.out.println(s.area());
		System.out.println(c1.area());
		
	}
	
}
