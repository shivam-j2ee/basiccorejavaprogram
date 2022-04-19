package com.raystech.OOP.PolymorphismExample;

public class CircleUsingMethodArgument extends ShapeMethodOverridingUsingMethodArgument {

	int radius=4;
	public double area(){
		
		double d = 3.14*radius*radius;
		return d;
	}
	
}
