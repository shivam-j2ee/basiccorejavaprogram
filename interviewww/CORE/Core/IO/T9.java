package com.raystech.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class T9 {

	public static void main(String[] args) throws IOException {

		FileReader f = new FileReader("D:/C Data/hukumchand_pal.txt");
		BufferedReader b = new BufferedReader(f);
		
		String s = b.readLine();
		while(s!=null){
			System.out.println(s);
			s = b.readLine();
			
		}
		
		b.close();
		f.close();
	}

}
