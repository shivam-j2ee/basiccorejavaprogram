package com.raystech.JavaBasic;

public class TestTableBetween2To20 {

	public static void main(String[] args) {

		int n=0;
		for(int i=2;i<=20;i++){
			for(int j=1;j<=10;j++){
			
			n =i*j;
			System.out.print(n+"\t");
				
			}
			System.out.println();
		}
		
	}

}
