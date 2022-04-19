package com.raystech.JavaBasic;

public class ReverseGivenNo {

	public static void main(String[] args) {

    int a=0,n=33897;
    while(n!=0){
    	
    	a = n%10;
    	n = n/10;
    
    	System.out.print(a);
    }
		
	}

}
