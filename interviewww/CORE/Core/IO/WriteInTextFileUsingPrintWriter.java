package com.raystech.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteInTextFileUsingPrintWriter {

	public static void main(String[] args) throws IOException {

		FileWriter f = new FileWriter("D:/C Data/hukumchand_pal.txt");
		PrintWriter p = new PrintWriter(f);
		
		p.println("Java is OOP.It is mainly used in Project");
		p.print(65);
		p.print('P');
		p.print(true);
		p.println(76.23);
	
		//p.flush();
		p.close();
		p.println("bdjvb");
		//p.close();
		p.flush();
		System.out.println(p);
		
		
	}

}
