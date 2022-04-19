package com.raystech.OOP.PolymorphismExample;

public class TestMethodOverridingThroughInterface {

	public static void main(String[] args) {
     
		BankMethodOverridingThroughInterface b1 = new SBI();
		BankMethodOverridingThroughInterface b2 = new ICICI();
		
		System.out.println(b1.rateOfInterest());
		System.out.println(b2.rateOfInterest());
		
		
	}

}
