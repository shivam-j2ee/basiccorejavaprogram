package com.raystech.JavaBasic;

public class FindLargestNoinArray {

	public static void main(String[] args) {

	
		int[] i = {23,99,34,45,90};
		int s = i[0];
		
		for(int element : i){
			if(element > s){
				s = element;
			}
		}
		System.out.println(s);
	}

}
