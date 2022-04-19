package com.raystech.IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class T2 {

	
	public static boolean isEmail(String s){
		
		String regex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,5})$";
		
		return s.matches(regex);
	}
	
	public static void main(String[] args) throws IOException {

		/*pal@gmail.com
		pal@yahoo.com
		p123@12.com
		p@gmail123.com*/
		
		PrintWriter p = new PrintWriter(new FileWriter("D:/C Data/hukumchand_pal.txt",true));
		
		/*PrintWriter p = new PrintWriter("D:/C Data/hukumchand_pal.txt","true");*/   //false [("true")/(true)]
		
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		
		String s = b.readLine();
		while(!s.equals("exit")){
			
			if(isEmail(s)){
				
				p.println(s);
			}
			s = b.readLine();
		}
		b.close();
		i.close();
		p.close();
		
	}

}
