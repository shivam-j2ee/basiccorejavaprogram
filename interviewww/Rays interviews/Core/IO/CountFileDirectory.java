package com.raystech.IO;

import java.io.File;

public class CountFileDirectory {

	public static void main(String[] args) {

		//FileInputStream f = new FileInputStream("D:/C Data/image2.jpg");
		
		File f = new File("D:/C Data");
		System.out.println(f.exists());
		
		String[] s = f.list();

		for(String st : s){
			
		   File ff = new File(f,st);
		   if(ff.isFile()){
			   System.out.println("File : " + st);
			   
		   }else if(ff.isDirectory()){
			   System.out.println("Directory : " + st);
		   }
			
		}	
		
	}

}
