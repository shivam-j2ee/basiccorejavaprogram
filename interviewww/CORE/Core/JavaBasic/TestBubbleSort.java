package com.raystech.JavaBasic;

public class TestBubbleSort {

	public static void main(String[] args) {

		int[] a = {25,50,5,75,10};
		
		for(int i=0;i<=a.length-1;i++){
			for(int j=i+1;j<=a.length-1;j++){
				if(a[i]>a[j]){
					int temp =a[j];
					  a[j] = a[i];
					  a[i] = temp;
				}				
			}
		}
			for(int k=0;k<=a.length-1;k++){
				System.out.println(a[k]+" ");
			
		}
	}

}
