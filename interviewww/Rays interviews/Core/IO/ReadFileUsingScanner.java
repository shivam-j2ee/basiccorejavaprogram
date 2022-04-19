package com.raystech.IO;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileUsingScanner {

	public static void main(String[] args) throws IOException {

		FileReader f = new FileReader("D:/C Data/hukumchand_pal.txt");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNext()){
			
			 String s = sc.nextLine();
			// String s = sc.next();
			//System.out.println(sc.next());
			//System.out.println(sc.nextLine());
			System.out.println(s);
		}
		f.close();
		
	}

}
