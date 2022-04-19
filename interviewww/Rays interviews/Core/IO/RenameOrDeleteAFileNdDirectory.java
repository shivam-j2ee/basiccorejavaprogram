package com.raystech.IO;

import java.io.File;

public class RenameOrDeleteAFileNdDirectory {

	public static void main(String[] args) {

		File f = new File("D:/C Data/hukumpal.txt");
		//File newFile = new File("D:/C Data/hukumchand_pal.txt");
		//Rename a Directory
		f.renameTo(new File("D:/C Data/hukumchand_pal.txt"));
		System.out.println(f);

		/*if(f.renameTo(newFile)){
			System.out.println("Rename File Success");
			
		}else{
			System.out.println("Failed");
		}*/
		
		File f1 = new File("D:/C Data/newFile.txt");

		//Delete a file
		f1.delete();
		
		//Delete file if exist
		//f1.deleteOnExit();
		System.out.println(f1);
	}

}
