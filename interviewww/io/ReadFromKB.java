package com.raystech.core.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKB {
public static void main(String[] args) throws IOException {
	//FileInputStream fis=new FileInputStream("F:/abc.txt");
	FileWriter fw=new FileWriter("F:/keyboard.txt",true);
	//PrintWriter pw=new PrintWriter("F:/keyboard.txt");
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String line=br.readLine();
	while(!line.equals("quit")){
		fw.write(line);
		line=br.readLine();
	}
	fw.close();
	br.close();
}
}
