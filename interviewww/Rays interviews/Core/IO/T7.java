package com.raystech.IO;

import java.io.File;
import java.io.IOException;

public class T7 {

	public static void main(String[] args) throws IOException {

		File f = new File("D:/C Data","ff");
		
		//File f1 = new File(f,"fp");
		f.mkdir();

		System.out.println(f);
		
		
	}

}
