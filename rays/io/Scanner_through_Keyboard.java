package in.co.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Scanner_through_Keyboard{
	public static void main(String[] args) throws IOException {
	
	FileWriter fw = new FileWriter("F:/iO_FILES/Scanner.txt");
	PrintWriter p = new PrintWriter(fw);
	
	Scanner sc= new  Scanner(System.in);
	System.out.println("enter any character");
	p.println(sc.nextLine());
	fw.close();
	p.close();
	
	
	}	
}