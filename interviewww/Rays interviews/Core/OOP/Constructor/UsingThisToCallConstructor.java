package com.raystech.OOP.Constructor;

public class UsingThisToCallConstructor {

	String firstName;
	String lastName;
	String address;
	
	public UsingThisToCallConstructor(String firstName,String lastName) {
	
            this.firstName=firstName;
            this.lastName=lastName;
           System.out.println(firstName+"  "+lastName);
				
	}
	public UsingThisToCallConstructor(String firstName,String lastName,String address) {
		
        this(firstName,lastName);
        this.address=address;
        System.out.println(firstName+"  "+lastName+"    "+address);
}
	public void show(){
		System.out.println(firstName+"  "+lastName+"    "+address);
	}
	public static void main(String[] args) {
		
		UsingThisToCallConstructor u1 = new UsingThisToCallConstructor("Hukum", "Pal");
		UsingThisToCallConstructor u2 = new UsingThisToCallConstructor("Hukum", "Pal", "Indore");
	     u1.show();
	     u2.show();
	
  	}
	
	
}
