package com.raystech.JavaBasic;

public class GivenNoisPrime {

	public static void main(String[] args) {

	    int i=10;
	    boolean flag =true;
	   for(int n=2;n<=i/2;n++){
	    	
	    	if(i%n==0){
	    		System.out.println("Not Prime "+i);
	    	 flag =false;
	    	}
	    	
	    }if(flag==true){
	    	System.out.println("Prime No "+i);
	    }
   		
		/*int no=7;
		boolean flag=true;
		for(int i=2;i<=no/2;i++){
			if(no%i==0){
				System.out.println("no is not prime");
				flag=false;
			}
		}
		if(flag==true){
			System.err.println("no is a prime");
		}*/

		
	}

}
