package com.raystech.OOP;

public class ExplicitCons2 extends ExplicitCons1{

	
	public ExplicitCons2(String name) {
	 
	   super(3);
	   System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		ExplicitCons2 e = new ExplicitCons2("Hukum");
		
	}
}
