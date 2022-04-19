package com.raystech.core.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("F:/keyboard.txt");
	//FileInputStream fis=new FileInputStream("F:/keyboard.txt");
	BufferedReader br=new BufferedReader(fr);
	String line=br.readLine();
	while (line!=null){
		System.out.println(line);
		line=br.readLine();		
	}	
}
}
