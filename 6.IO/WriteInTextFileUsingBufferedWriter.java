package com.raystech.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInTextFileUsingBufferedWriter {

	public static void main(String[] args) throws IOException {

		FileWriter f = new FileWriter("D:/C Data/hukumchand_pal.txt");
		BufferedWriter b = new BufferedWriter(f);
		char[] c = {'H','U','K','U','M'};
		b.write(c);
		b.write(65);
		b.write("PAL");
		b.write("102");
		b.close();
		System.out.println(b);
	}

}
