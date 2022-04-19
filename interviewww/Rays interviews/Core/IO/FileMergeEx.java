package com.raystech.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMergeEx {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter(new FileWriter("D:/C Data/second.txt",true));
		BufferedReader b1 = new BufferedReader(new FileReader("D:/C Data/hukumchand_pal.txt"));
		BufferedReader b2 = new BufferedReader(new FileReader("D:/C Data/first.txt"));
		
		String s1 = b1.readLine();
		String s2 = b2.readLine();

		System.out.println(s1.length()+ "  "+ s2.length());
		while(s1!=null){
			pw.println(s1);
			System.out.println(s1);
			s1=b1.readLine();
			
		}
		while(s2!=null){
			
			pw.println(s2);
			System.out.println(s2);
			s2=b2.readLine();
		}
		
		/*while(s1!=null || s2!=null){
			if(s1!=null){
				
				pw.println(s1);
				System.out.println(s1);
				s1 = b1.readLine();
			}
          if(s2!=null){
				
				pw.println(s2);
				System.out.println(s2);
				s2 = b2.readLine();
			}
		}*/
		
		 b2.close();
		 b1.close();
		 pw.close();
			    
	}

}
