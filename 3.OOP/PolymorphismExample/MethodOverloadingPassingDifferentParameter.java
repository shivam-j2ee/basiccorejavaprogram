package com.raystech.OOP.PolymorphismExample;

public class MethodOverloadingPassingDifferentParameter {

	int id;
	String name;
	String address;
	
	public void show(int id,String name){
		
		this.id=id;
		this.name=name;
	  System.out.println(id+"  "+name);			
		
	}
   public void show(int id,String name,String address){
		
		this.id=id;
		this.name=name;
		this.address=address;
	  System.out.println(id+"  "+name+"  "+address);			
		
	}
	
	public static void main(String[] args) {

		MethodOverloadingPassingDifferentParameter m1 = new MethodOverloadingPassingDifferentParameter();
		m1.show(1, "HukumPal");
		m1.show(2, "DakshPal","Mumbai");
		
	}

}
