package com.raystech.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {
	
public static void main(String[] args) throws IOException {
	
	FileReader f = new FileReader("D:/C Data/IOExampleFile.txt");
	BufferedReader b = new BufferedReader(f);
	
	    String s = b.readLine();
	     
	    if(s!=null){
	    	
	    	System.out.println(s + "\n");
	    	s=b.readLine();
	    	System.out.println(s);
	    	int i =b.read();
	    	System.out.println(i);
	    	System.out.println((char)i);
	    	/*s=b.readLine();
	    	System.out.println(s);*/
	    
	    }
	    b.close();
   }
	
}
