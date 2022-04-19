package com.raystech.IO;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_A_LineUsingScanner {

	public static void main(String[] args) throws IOException {

		
		FileReader f = new FileReader("D:/C Data/IOExampleFile.txt");
		
		Scanner sc = new Scanner(f);
		while(sc.hasNext()){
		String s =	sc.nextLine();
		//String s =	sc.next();
		System.out.println(s);
		
		
		}
		
	}

}
