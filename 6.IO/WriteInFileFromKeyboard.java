package com.raystech.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WriteInFileFromKeyboard {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("D:/C Data/hukumchand_pal.txt");
        InputStreamReader i = new InputStreamReader(System.in);
        
        BufferedReader b = new BufferedReader(i);
        String s = b.readLine();
        
        while(!s.equals("exit")){
        	 pw.write(s);
        	 //pw.println(s);
        	
        	s = b.readLine();
        }
       pw.flush();
        b.close();
		pw.close();
		
		
	}

}
