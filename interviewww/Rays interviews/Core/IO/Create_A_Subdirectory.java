package com.raystech.IO;

import java.io.File;

public class Create_A_Subdirectory {

	public static void main(String[] args) {

		
		File f = new File("D:/C Data/jboss");
	
		//Create a sub-directory
				File subdir = new File(f,"testt43t");
				subdir.mkdir();
				//subdir.mkdirs();
				System.out.println(subdir);
		
		
		
	}

}
