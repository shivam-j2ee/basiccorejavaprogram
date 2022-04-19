package com.raystech.OOP;


public class ExplicitConstructor extends ImplicitConstructor {

       int i;
       
       public ExplicitConstructor(int i,String name) {
	 
    	    super(name);
    	    this.i=i;      
    	    System.out.println("Explicit Constructor " +i+",,,"+name);    	    
       
       }
	
	public static void main(String[] args) {

		ImplicitConstructor i = new ExplicitConstructor(10, "Hukum");
		//System.out.println(i);
		
	}

}
