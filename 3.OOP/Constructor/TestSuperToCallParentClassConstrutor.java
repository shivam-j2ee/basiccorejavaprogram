package com.raystech.OOP.Constructor;

public class TestSuperToCallParentClassConstrutor extends UsingSuperToCallParentClassConstructor{

	int id;
	String name;
	String address;
	
	public TestSuperToCallParentClassConstrutor(int id,String name,String address) {
                  super(id,name);
                  this.address=address;
                  System.out.println(id+ "  " + name+ "   " + address);
	       
	}
	public static void main(String[] args) {
		
		TestSuperToCallParentClassConstrutor t1 = new TestSuperToCallParentClassConstrutor(23, "HukumPal", "Bhopal");
		
	}
	
}
