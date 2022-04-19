package com.raystech.JavaBasic;

public class FirstSecondAndThirdLargestNoinArray {

	public static void main(String[] args) {

		int[] a = {522,4,34,54,89,343};
		int h =0;
		int sh=0;
		int th=0;
		
		for(int n:a){
			if(h<n){
				th=sh;
				sh =h;
				h = n;
				
			}
		}
		System.out.println("Largest No is " +h);
		System.out.println("Second Largest No is "+sh);
		System.out.println("Third Largest No is "+th);
	}

}
