package com.raystech.core.io;

import java.io.File;
import java.util.Date;

public class ReadFileNames {
public static void main(String[] args) {
	File file=new File("F:/IOExample");
	String files[]=file.list();
	for(String fileName:files){
		System.out.println(fileName);
		System.out.println("$$$$$$$$$$$$");
	}
	File fileNew=new File("F:/IOExample");
	System.out.println(fileNew.isDirectory());
	System.out.println(fileNew.isFile());
	System.out.println(fileNew.getParentFile());
	System.out.println(fileNew.canWrite());
	System.out.println(fileNew.canRead());
	System.out.println(fileNew.canExecute());
	System.out.println("@@@@@@@@@@@@@@@@");
	System.out.println(new Date(fileNew.lastModified()));
}
}
