package com.raystech.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class T3 {

	public static void main(String[] args) throws IOException {

		BufferedReader b = new BufferedReader(new FileReader("D:/C Data/hukumchand_pal.txt"));
	     
	   	//Using this, we can append a file data into another file
	    /*PrintWriter pw1 = new PrintWriter(new FileWriter("D:/C Data/hukumchand_pal1.txt",true));	
	    PrintWriter pw2 = new PrintWriter(new FileWriter("D:/C Data/hukumchand_pal2.txt",true));*/
	
		//But Using this, we can't append a file data into another file
		PrintWriter pw1 = new PrintWriter("D:/C Data/hukumchand_pal1.txt");	
	    PrintWriter pw2 = new PrintWriter("D:/C Data/hukumchand_pal2.txt");
	
	    String s = b.readLine();
	    while(s!=null){
	    	
	    	for(int i=1;i<=3;i++){
	    		pw1.println(s);
	    		s = b.readLine();	    		
	    	}
	    	for(int i=4;i<=8;i++){
	    		
	    		pw2.println(s);
	    		s = b.readLine();
	    	}
	    	
	    }
	   pw2.close();
	   pw1.close();
	   b.close();
	
	
	}

}
