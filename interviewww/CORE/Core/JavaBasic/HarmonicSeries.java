package com.raystech.JavaBasic;

public class HarmonicSeries {

	public static void main(String[] args) {
		
		int n =5;
		float f=1;
		String s ="1";
		for(int i=1;i<=n;i++){
			f = f+((float)1/i);
			//s = s+"+"+"(1/"+i+")";
			s = s+"+(1/"+i+")";
		}
		System.out.println(s+"="+f);
	}

}
