package com.raystech.JavaBasic;

public class TestOddNoWithSumAndAverage {

	public static void main(String[] args) {

		int sum=0,count=0;
		
		for(int i=1;i<=100;i++){
			
			if(i%2!=0){
				sum = sum+i;
				count = count+1;
				System.out.print(i+"\t");
			}
		}
		System.out.println();
		System.out.println(sum);
		System.out.println((sum/count));
		
	}

}
