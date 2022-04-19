package com.raystech.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmailEx {

	
	public static boolean isEmail(String s){
	
	String regex = "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        
		return s.matches(regex);
	
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader b = new BufferedReader(new FileReader("D:/C Data/hukumchand_pal.txt"));
		String s = b.readLine();
		while(s!=null){
			
			if(isEmail(s)){
				
				System.out.println(s);
			}
			s = b.readLine();
			
			
		}
		
		
	}

}
