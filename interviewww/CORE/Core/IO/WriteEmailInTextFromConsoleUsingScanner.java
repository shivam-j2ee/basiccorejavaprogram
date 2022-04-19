package com.raystech.IO;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteEmailInTextFromConsoleUsingScanner {

	public static boolean isEmail(String s){
		
		String email = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,5})$";
		
		return s.matches(email);
	}	
	
	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("D:/C Data/Test1.txt");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		while(!s.equals("exit")){
			
			if(isEmail(s)){
				pw.println(s);
				System.out.println(s);
				
			}
			s = sc.nextLine();
		}
		 sc.close();
		 pw.close();
		
	}

}
