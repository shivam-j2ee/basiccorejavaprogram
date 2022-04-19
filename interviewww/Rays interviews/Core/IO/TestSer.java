package com.raystech.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSer {

	public static void main(String[] args) throws IOException{

		   FileOutputStream f = new FileOutputStream("D:/C Data/hukumchand_pal.ser");
           ObjectOutputStream o = new ObjectOutputStream(f);
           
           SerNdDeser s = new SerNdDeser("Hukum", 76, 78, 89);
		   o.writeObject(s);
		   
		   System.out.println("Serialization Success");
               
	
	}
	
}
