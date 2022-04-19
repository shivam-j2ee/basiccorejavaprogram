package com.raystech.OOP.TestOOPPrograms;

public class MOUsingTypePropagation {

	void sum(int a,long b){
		
		System.out.println(a+b);
		
	}
	void sum(int a,int b,int c){
		
		System.out.println(a+b+c);
		
	}
	public static void main(String[] args) {
		
		MOUsingTypePropagation mo = new MOUsingTypePropagation();
		mo.sum(12,12);
		mo.sum(12, 12, 12);
	}
	
}
