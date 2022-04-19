package com.raystech.OOP.Constructor;

public class ImplicitConstructor {
	
	String name;
	
	public ImplicitConstructor() {

	System.out.println("Default Implicit Constructor Called");
	}
	public ImplicitConstructor(String name){
         this.name=name;
         System.out.println("Implicit Constructor Called "+ name);
  }
	
	public static void main(String[] args) {
		
		ImplicitConstructor i = new ImplicitConstructor();
		ImplicitConstructor i1 = new ImplicitConstructor("Hukum");
	       //System.out.println(i1.name);	
	}
}
