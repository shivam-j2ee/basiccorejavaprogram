package com.raystech.OOP.PolymorphismExample;

public class CircleClassOverrideMethodCallParentMethod extends ShapeClassMethodCallUsingSuper {

	public void show(){
		System.out.println("Child Class Circle Overriden Method Show Called");
		super.show();
	}
	
	
	public static void main(String[] args) {

		CircleClassOverrideMethodCallParentMethod c = new CircleClassOverrideMethodCallParentMethod();
		c.show();
		
	}

}
