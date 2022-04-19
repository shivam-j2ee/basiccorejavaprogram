package com.raystech.Exception;

public class FamilyPropogationWithChecked {

	public static void dad(){
		try{
		mom();
		}catch(CustomCheckedException e){
			e.printStackTrace();
						
		}
	}
	public static void mom() throws CustomCheckedException{
		
		son();
	}
	public static void son() throws CustomCheckedException{
		
		//CustomCheckedException c = new CustomCheckedException();
		//throw c;
		throw new CustomCheckedException();
		
	}
	
	
	public static void main(String[] args) {

		dad();
	}

}
