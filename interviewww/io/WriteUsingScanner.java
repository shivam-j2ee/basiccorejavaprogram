package com.raystech.core.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteUsingScanner {

	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("F:/IOExample/Writeusingscanner.txt");
		PrintWriter out = new PrintWriter(file,true);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value");
		out.println(sc.nextLine());		
		out.close();
		file.close();
	}

}
