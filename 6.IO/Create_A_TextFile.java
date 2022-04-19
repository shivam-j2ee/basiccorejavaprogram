package com.raystech.IO;

import java.io.File;
import java.io.IOException;

public class Create_A_TextFile {

	public static void main(String[] args) throws IOException {

		File f = new File("D:/C Data","f1232.txt");
		
		f.createNewFile();
		System.out.println(f);
		
	}

}
