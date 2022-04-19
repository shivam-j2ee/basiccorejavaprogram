package com.raystech.JavaBasic;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a = {12,67,56,4,8};
	
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					
				}				
			}
		}
		for(int k=0;k<a.length;k++){
			System.out.print(a[k]+" ");
			
		}
	}
}
