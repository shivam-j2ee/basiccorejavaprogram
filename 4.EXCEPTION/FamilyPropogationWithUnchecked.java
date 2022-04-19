package com.raystech.Exception;

public class FamilyPropogationWithUnchecked {

	public static void dad(){
		try{
			
			mom();
			
		}catch(CustomUncheckedException e){
			e.printStackTrace();
			//System.out.println(e.getMessage());
			
		}
	}
		public static void mom(){
			
		  son();	
		}
		public static void son(){
  
			 //CustomUncheckedException c = new CustomUncheckedException();
			throw new CustomUncheckedException();		
		}
	public static void main(String[] args) {
		
		dad();
		
	}
}
