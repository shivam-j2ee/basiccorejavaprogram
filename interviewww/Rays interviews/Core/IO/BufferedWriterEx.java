package com.raystech.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {

		FileWriter f = new FileWriter("D:/C Data/IOExampleFile.txt");
		BufferedWriter b = new BufferedWriter(f);
		
		b.write("HukumPal");
		b.newLine();
		b.write(65);
		b.newLine();
		b.write('P');
		//b.flush();
		b.newLine();
		b.write("Ankit Jain ");
		b.write(" Jayesh");
		b.newLine();
		b.write(97);
		//b.flush();
		b.write("  hvjkhb");
		b.close();   // It internally call flush() method
		//b.write("Nilesh Sharma");
		
	System.out.println(f);	
	}

}
