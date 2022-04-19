package com.raystech.StrinG;

public class ImmutableObject {
	public static void main(String[] args){

	//String str = "Hukum";
	String str1 = new String("Hukum");
	
	//System.out.println(str);
	//System.out.println(str1);
	
	// Both work same
	//str1 = str1.concat("pal"); //here hold the String in the variable.So it store the String in the str1 Object.
	str1.concat("Pal");  //here not hold the String in the variable.So it wont store the String in the str1 Object.
	
	System.out.println(str1);
	
	/*System.out.println(str + "----" + str1);
	System.out.println(str.equals(str1));
	System.out.println(str==str1);*/
	
	String s = new String("Vipulbaser");
	
	boolean s1= s.equals(s);
	System.out.println(s1);
	
	}
	
}
