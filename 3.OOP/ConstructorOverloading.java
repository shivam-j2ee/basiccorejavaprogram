package com.raystech.OOP;

public class ConstructorOverloading {

   public ConstructorOverloading(int a,int b) {
           System.out.println(a+b);

  }
   /*public ConstructorOverloading(int a,int b,int c) {

	   System.out.println(a+b+c);
   }*/
   
   public static int ConstructorOverloading(int a,int b,int c) {
      // int i = a+b+c;
     return (a+b+c);
}
   
	public static void main(String[] args) {

		ConstructorOverloading c = new ConstructorOverloading(12, 12);
		//ConstructorOverloading c1 = new ConstructorOverloading(12, 12, 12);
		int a = c.ConstructorOverloading(12, 12, 12);
	
	    System.out.println(a);
	}

}
