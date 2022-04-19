package com.raystech.core.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryDataCopy {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("F:/IOExample/Rays.jpg");
	FileOutputStream fos=new FileOutputStream("F:/IOExample/excetionq.jpg");
	int ch=fis.read();
	while(ch!=-1){
		fos.write(ch);
		ch=fis.read();
	}
	fis.close();
	fos.close();
	System.out.println("Image Copied");
}
}