package com.raystech.core.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerge {
public static void main(String[] args) throws IOException {
	File file=new File("F:/IOExample/Merge1.txt");
	String files[]=file.list();
	for (String fileName:files){
		System.out.println(file+fileName);
		FileWriter pw=new FileWriter("F:/IOExample/Merge2.txt",true);
		FileReader fis=new FileReader(file+"/"+fileName);
		BufferedReader br=new BufferedReader(fis);
		String line=br.readLine();
		while(line!=null){
			pw.write(line);
			line=br.readLine();
		}
		pw.close();
		br.close();
	}	
	System.out.println("Files Merged");
}
}
