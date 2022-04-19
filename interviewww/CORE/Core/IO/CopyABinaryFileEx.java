package com.raystech.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyABinaryFileEx {

	public static void main(String[] args) throws IOException {

		FileInputStream f = new FileInputStream("D:/C Data/image2.jpg");
		FileOutputStream out = new FileOutputStream("D:/C Data/image3.jpg");
			
		int ch =f.read();
		while(ch!=-1){
		   //System.out.println((char)ch);
			out.write(ch);
			ch=f.read();
			System.out.println((char)ch);
		}
		//out.flush();
		//f.close();
		out.close();
		f.close();
	}

}
