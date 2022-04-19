package com.raystech.StrinG;

public class ConvertStringToCharArray {

	 public static void main(String[] args) {
		
	
      String s = new String("vipul");
     
      char[] c=s.toCharArray();
      
      for(int i=0;i<s.length();i++){
      System.out.println("String to Char Array==" + c[i]);
	}
 }
}
