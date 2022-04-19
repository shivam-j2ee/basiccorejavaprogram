package com.raystech.OOP.TestOOPPrograms;

public class TestS1C1R1 {

	public static void main(String[] args) {

		/*TestS1 s = new TestC1();
		TestS1 ss = new TestR1();*/
		
		/*TestC1 c = new TestC1();
		TestR1 r = new TestR1();*/
		
		/*TestS1 s = new TestC1();
		TestC1 c = (TestC1)s;
		//TestR1 r =(TestR1)s;
		System.out.println(c.area());
		System.out.println(s.area());
		//System.out.println(r.area());
*/		
		TestS1 s = new TestR1();
		TestR1 r =(TestR1)s;
		//TestC1 c = (TestC1)s;
		//System.out.println(c.area());
		System.out.println(s.area());
		System.out.println(r.area());

	     
		/*TestR1 r = new TestR1();
		System.out.println(r.area());*/
	
	
	}

}
