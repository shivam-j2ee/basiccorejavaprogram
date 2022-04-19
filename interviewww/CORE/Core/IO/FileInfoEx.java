package com.raystech.IO;

import java.io.File;

public class FileInfoEx {

	public static void main(String[] args) {

		File f = new File("D:/C Data/IOExampleFile.txt");
		
		if(f.exists()){
			System.out.println("Name : " + f.getName());
			System.out.println("Path : " + f.getAbsolutePath());
			
			//Check Access Permission
			System.out.println("Access Permission");
			System.out.println("Writable : " + f.canWrite());
			System.out.println("Readable : " + f.canRead());
			
			//Check if it is a directory or a file
			System.out.println("Is File : " + f.isFile());
			System.out.println("Is Directory :" + f.isDirectory());
			
			//Last Modified date of File/Directory
			System.out.println("Date Modified :" + f.lastModified());
			
			//Length of a file
			long length = f.length();
			System.out.println("Length : " + f.length());
			
		}else{
			System.out.println("File does not exist");
			
		}	
	}

}
