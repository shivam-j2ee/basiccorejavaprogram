package com.raystech.IO;

import java.io.File;

public class ListOfSubdirectoriesAndFiles {

	public static void main(String[] args) {

		File f = new File("D:/C Data/jboss");
		
		//get the list of files and sub-directories
		String[] s = f.list();
		for(String st : s)
		System.out.println(st);
		
		
		
	}

}
