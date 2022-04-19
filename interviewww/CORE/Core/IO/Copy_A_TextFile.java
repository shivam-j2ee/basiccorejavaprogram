package com.raystech.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy_A_TextFile {

	public static void main(String[] args) throws IOException {

		FileReader f = new FileReader("D:/C Data/Test1.txt");
		
		 //if we don't write true then it override the data into another text file.
		FileWriter fw = new FileWriter("D:/C Data/hukumchand_pal1.txt",true);
		
		int ch = f.read();
		while(ch!=-1){
			
			fw.write(ch);
  System.out.print((char)ch);
			ch=f.read();
			
		}
		fw.close();
		f.close();
		
	}

}
