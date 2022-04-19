package com.raystech.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_A_LineFromTextFile {

	public static void main(String[] args) throws IOException {

		
		FileReader f = new FileReader("D:/C Data/IOExampleFile.txt");
		BufferedReader b = new BufferedReader(f);
		String s = b.readLine();
		if(s!=null){
			System.out.println(s);
		 s = b.readLine();
		
		}
		b.close();
		f.close();
		
	}

}
