package com.raystech.Exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {

			sum();
	}
	
	public static void sum(){
		
		try{
			 String s = "Hukum";
		     System.out.println(s.length());
		     //System.exit(0);
		     System.out.println(s.charAt(8));
		     //System.exit(0);
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println(" Raised");
			System.exit(0);
		}catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();
			//System.exit(0);
			System.out.println("Exception is Raised");
			//System.exit(0);
		}finally{
			
			System.out.println("Executed");
			
		}
		
	}

}
