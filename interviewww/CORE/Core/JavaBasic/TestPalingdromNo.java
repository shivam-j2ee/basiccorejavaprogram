package com.raystech.JavaBasic;

public class TestPalingdromNo {

	public static void main(String[] args) {

		int a=131,sum=0,n=0,i=a;
		
		while(a!=0){
			
			n=a%10;
			sum=sum*10+n;
			a=a/10;
		}System.out.println(sum);
		if(sum==i){
			System.out.println("Palingdrom No. "+sum);
			
		}else{
			System.out.println("Not Palingdrom "+sum);
		}
		
		
	}

}
