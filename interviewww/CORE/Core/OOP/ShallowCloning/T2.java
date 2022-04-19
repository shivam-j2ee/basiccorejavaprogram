package com.raystech.OOP.ShallowCloning;

public class T2 {

	public static void main(String[] args)throws CloneNotSupportedException {

		T1 t = new T1("OOP", "IO");
		T1 tt = (T1)t.clone();
		
		tt.sub1 = "Maths";
		System.out.println(t.sub1);
		System.out.println(tt.sub1);
		//System.out.println(tt.sub2);
		
	}

}
