package com.raystech.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class SplitFile {

	public static void main(String[] args) throws IOException {

		BufferedReader b = new BufferedReader(new FileReader("D:/C Data/IOExampleFile.txt"));
		PrintWriter pw1 = new PrintWriter("D:/C Data/first.txt");
		PrintWriter pw2 = new PrintWriter("D:/C Data/second.txt");
		
		String s = b.readLine();
		
		while(s!=null){
			
			pw1.println(s);
			System.out.println(s);
			
			s  = b.readLine();
			if(s!=null){
			pw2.println(s);
			System.out.println(s);
			
			//s = b.readLine();
			}
			s = b.readLine();
		}
		
		pw1.close();
		pw2.close();
		b.close();
	}

}
