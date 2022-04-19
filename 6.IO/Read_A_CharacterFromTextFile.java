package com.raystech.IO;

import java.io.FileReader;
import java.io.IOException;

public class Read_A_CharacterFromTextFile {

	public static void main(String[] args) throws IOException {

		FileReader f = new FileReader("D:/C Data/IOExampleFile.txt");
		int ch = f.read();
		
		if(ch!=-1){
				
		System.out.println((char)ch);
		ch=f.read();
		//System.out.println((char)ch);
		}
		f.close();
	}

}
