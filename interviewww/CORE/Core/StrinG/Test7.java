package com.raystech.StrinG;

public class Test7 {

	public static void main(String[] args) {
    
		// 1st way Here use Built-in function
		String s = new String("HukumPal");
		
		char[] ch = s.toCharArray();
		//System.out.println(ch);
		
		for(char c : ch)
			System.out.print(c);
		
		/*for(int i=0;i<ch.length;i++){
			
		  System.out.print(ch[i]);
		  
		}*/
		
		// 2nd way Here without use of Built-in function
		String st = new String("HukumPal");
		char[] ca = new char[st.length()];
		
		for(int i=0;i<st.length();i++){
			
			ca[i] = st.charAt(i);
		}
		System.out.println("\n");
		for(char cv : ca)
			System.out.print(cv);
	}

}
