package com.raystech.IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInTextFileUsingFileWriter {

	public static void main(String[] args) throws IOException {

		FileWriter f = new FileWriter("D:/C Data/hukumchand_pal.txt");
	
		char[] c = {'P','A','L'};
		f.write(c);
		f.write('L');
		f.write(90);
		f.write("HPAL");
		f.close();
		System.out.println(f);
	}

}
