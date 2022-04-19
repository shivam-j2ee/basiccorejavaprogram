package com.raystech.OOP.PolymorphismExample;

public class MethodOverloadingUsingDataType {

	
	public int add(int a,int b){
		
		//System.out.println((a+b));
		return (a+b);
	}
	public void add(int a,int b,int c){
	  System.out.println((a+b+c));
		
	}
	
	public static void main(String[] args) {
		
		MethodOverloadingUsingDataType mm = new MethodOverloadingUsingDataType();
		
		System.out.println(mm.add(12, 13));
		mm.add(12,14,12);
		
	}
	
}
