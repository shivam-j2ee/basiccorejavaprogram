package com.raystech.Exception;


public class SingleCachBlockWithMultipleChildException {
	
	public static void main(String[] args) {
		try{
		String s = "Hukum";
		System.out.println(s.charAt(7));
		System.out.println(s.length());
		
		//System.out.println(s.length());
		}catch (NullPointerException|StringIndexOutOfBoundsException|ArrayIndexOutOfBoundsException e) {
           e.printStackTrace();
		System.out.println("Out Of Indexing");
		}
		finally{
			
			System.out.println("It is always executed");
		
			try{
				String s = "Hukum";
				System.out.println(s.charAt(7));
				System.out.println(s.length());
				
				//System.out.println(s.length());
				}catch (NullPointerException|StringIndexOutOfBoundsException|ArrayIndexOutOfBoundsException e) {
		           e.printStackTrace();
				System.out.println("Out Of Indexing");
				}
		}	
		
	}
	

}
