package com.raystech.IO;

import java.io.FileReader;
import java.io.IOException;

public class T8 {

	public static void main(String[] args) throws IOException {

		FileReader f = new FileReader("D:/C Data/hukumchand_pal.txt");
		
		int ch = f.read();
		
		/*while(ch!=-1){
			
			System.out.print((char)ch);
			ch = f.read();
		}*/
		
		if(ch!=-1){
			System.out.print((char)ch);
			ch = f.read();
		}
		
		f.close();
	}

}
