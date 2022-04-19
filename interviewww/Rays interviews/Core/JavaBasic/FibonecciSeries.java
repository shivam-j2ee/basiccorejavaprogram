package com.raystech.JavaBasic;

public class FibonecciSeries {

	public static void main(String[] args) {

      int a=0,b=1,c=0;
      int n=10;
      for(int i=1;i<=n;i++){
    	  c = a+b;
    	  a = b;
    	  b = c;
    	  System.out.print(c + "\t");
    	  
      }
	
	}

}
