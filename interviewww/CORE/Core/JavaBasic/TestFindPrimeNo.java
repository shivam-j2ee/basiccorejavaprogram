package com.raystech.JavaBasic;

public class TestFindPrimeNo {

	public static void main(String[] args) {

		for(int i=1;i<=50;i++){
			boolean flag=true;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					flag=false;
				}
				
			}if(flag==true){
				System.out.print(i+"\t");
			}
			
		}
		
		
	}

}
