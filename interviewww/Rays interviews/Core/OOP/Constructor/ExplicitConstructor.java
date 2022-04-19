package com.raystech.OOP.Constructor;

public class ExplicitConstructor extends ImplicitConstructor{

	int i;
	public ExplicitConstructor() {

		System.out.println("Default Explicit Constructor Called");
	}
	
	public ExplicitConstructor(int i,String name) {
           super(name);
           this.i=i;
		System.out.println("Explicit Constructor Called " + i+"  "+name);
	}
	public static void main(String[] args) {
		
		ExplicitConstructor i = new ExplicitConstructor(12,"Hukum");
	}
	
}
