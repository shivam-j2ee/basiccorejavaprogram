package com.raystech.JavaBasic;

public class TestPrimeNo {

	public static void main(String[] args) {

		int a=49;
		boolean flag=true;
		for(int i=2;i<=a/2;i++){
			
			if(a%i==0){
				flag =false;
				System.out.println("Not Prime "+a);
				break;
			}
		}if(flag==true){
			System.out.println("Prime No. "+a);
		}
		
	}

}
