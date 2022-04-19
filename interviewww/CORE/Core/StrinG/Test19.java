package com.raystech.StrinG;

public class Test19 {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		
		for(int i=0;i<10000;i++){
		String a = new String("Pal");
		String b = new String("Pal");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time Taken is " +(endTime-startTime));
		
		long startTime1 = System.currentTimeMillis();
		
		for(int i=0;i<10000;i++){
			String c = "Pal";
			String d = "Pal";
						
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Time Taken is " + (endTime1-startTime1));
	}

}
