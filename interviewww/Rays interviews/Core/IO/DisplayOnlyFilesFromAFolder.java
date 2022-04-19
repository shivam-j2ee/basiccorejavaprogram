package com.raystech.IO;

import java.io.File;

public class DisplayOnlyFilesFromAFolder {

	public static void main(String[] args) {

		File f = new File("D:/C Data");
		
		File[] file = f.listFiles();
		
		for(int i=0;i<file.length;i++){
			if(file[i].isFile()){
				System.out.println((i+1)+ " : " + file[i].getName());
				
			}
			/*if(!file[i].isFile()){
				System.out.println((i+1)+ " : " + file[i].getName());
				
			}*/
		}	
           
	}

}
