package com.raystech.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Split_A_FileDataIntoTwoFile {

	public static void main(String[] args) throws IOException {

	   FileReader file = new FileReader("D:/C Data/hukumchand_pal.txt");
	   BufferedReader b = new BufferedReader(file);
	   
	   FileWriter f1 = new FileWriter("D:/C Data/hukumchand_pal1.txt",true);
	   PrintWriter p1 = new PrintWriter(f1);
	   
	   FileWriter f2 = new FileWriter("D:/C Data/hukumchand_pal2.txt",true);
	   PrintWriter p2 = new PrintWriter(f2);
		
	   String s = b.readLine();
		while(s!=null){
		for(int i=1;i<=6;i++){
			p1.println(s);
			System.out.println(s);
			s=b.readLine();
		}
		for(int i=7;i<=8;i++){
			
			p2.println(s);
			System.out.println(s);
			s= b.readLine();
			
		}	
		
		}
		
		f1.close();
		f2.close();
	}

}
