package com.raystech.JavaBasic;

public class TestHarmonicSeries {

	public static void main(String[] args) {

		float f=1;
		String s="1";
		
		for(int i=1;i<=6;i++){
			
			f = f+((float)1/i);
			s = s+"+(1/"+i+")";
			
		}
		System.out.print(s);
	}

}
