package com.raystech.JavaBasic;

public class FindOddNo {

	public static void main(String[] args) {

		 for(int i=1;i<=100;i++){
			if(i%2!=0){
				
			System.out.print(i+"\t");
			
			}   
		}	
		 
		 int sum=0,count=0;
	        for(int i=1;i<=100;i++){
				
				if(i%2!=0){
				//System.out.print(i+"\t");
				sum = sum+i;
				count = count+1;
				
				}   
			}
	        System.out.println(count);
	        System.out.println((sum/count));
	        System.out.println(sum);
	}

}
