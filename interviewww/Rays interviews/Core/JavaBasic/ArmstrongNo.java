package com.raystech.JavaBasic;

public class ArmstrongNo {

	public static void main(String[] args) {

		
		int i=153,s=i,a=0,sum=0;
		while(i!=0){
			a = i%10;
			sum = sum+a*a*a;
			i = i/10;
			
			
		}System.out.println(sum);
		/*if(s==sum){
			System.out.println("Given Number is Armstrong  "+sum);
		}else{
			System.out.println("Given Number is Not Armstrong  "+sum);
		}*/
	 String r = s==sum ? "Given No. is Armstrong "+sum :"Given No. is Not Armstrong "+sum;
	   
	    System.out.println(r);
	
	}

}
