package com.raystech.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class T10 {

	public static void main(String[] args) throws IOException {

		FileInputStream f = new FileInputStream("D:/C Data/Background-Wallpaper.jpg");
		FileOutputStream ff = new FileOutputStream("D:/C Data/BACKGROUND.png");
		
		int ch = f.read();
		while(ch!=-1){
			
			ff.write(ch);
			System.out.print((char)ch);
			ch = f.read();
		}
		
		ff.close();
		f.close();
	}

}
