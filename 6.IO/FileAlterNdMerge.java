package com.raystech.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAlterNdMerge {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("D:/C Data/TestFile.txt");
     
		BufferedReader b1 = new BufferedReader(new FileReader("D:/C Data/hukumchand_pal1.txt"));
 		BufferedReader b2 = new BufferedReader(new FileReader("D:/C Data/hukumchand_pal2.txt"));
		
 		String s1 = b1.readLine();
 		String s2 = b2.readLine();
 		
 		while(s1!=null || s2!=null){
 			if(s1!=null){
 			
 				pw.write(s1);
 				s1=b1.readLine();
 			}
 			if(s2!=null){
 				
 				pw.write(s2);
 				s2 = b2.readLine(); 
 				
 			}
 		}
 		System.out.println(pw);
		b2.close();
		b1.close();
		pw.close();
	}

}
