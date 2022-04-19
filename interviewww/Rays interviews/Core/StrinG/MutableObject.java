package com.raystech.StrinG;

public class MutableObject {

	public static void main(String[] args) {
		
	//StringBuffer sb = new StringBuffer("Hukum");
	
		StringBuffer sb = new StringBuffer("Hukum");
		
  	 sb.append("Pal");  //Here Not hold the sb.append but still add the string in the sb object.
  	
  	System.out.println(sb);
  	//System.out.println(sb.reverse());
  	
  }
}
