package com.raystech.JavaBasic;

public class TestFibonecciSeries {

	public static void main(String[] args) {

		int a=0,b=1,c=0;
		for(int i=1;i<=8;i++){
			c = a+b;
			a =b;
			b =c;
			System.out.print(c+"\t");
			
		}
		
	}

}
