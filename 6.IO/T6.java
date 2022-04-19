package com.raystech.IO;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class T6 {

	public static void main(String[] args) throws IOException {

		FileReader f  = new FileReader("D:/C Data/hukumchand_pal2.txt");
        PrintWriter pw = new PrintWriter("D:/C Data/hukumchand_pal1.txt");
		
        int ch = f.read();
		while(ch!=-1){
			
			pw.write((char)ch);
			System.out.println((char)ch);
			ch=f.read();
			
		}
	   pw.close();
	   f.close();
	    
	}
	
}
