package com.raystech.JavaBasic;

public class TestMissingElement {

	public static void main(String[] args) {

	
		int[] a ={23,10,67,21,89};
		int[] b ={10,67,23,5,89};
		
		for(int i=0;i<=a.length-1;i++){
			boolean flag=true;
			for(int j=0;j<=b.length-1;j++){
				if(a[i]==b[j]){
					flag=false;
				//System.out.print(a[i]+" ");
			}
		}if(flag==true){
	System.out.println("Missing Elements are "+a[i]);
		}				
	 }
	
   }
}
