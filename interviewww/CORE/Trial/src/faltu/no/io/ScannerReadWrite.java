package faltu.no.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerReadWrite {
public static void main(String[] args) throws FileNotFoundException {
	PrintWriter pw=new PrintWriter("C:/Users/Lenovo/Desktop/trial.txt");
	Scanner sc=new Scanner(System.in);
	
	String line=sc.nextLine();
	while(!line.equals("exit")) {
		pw.println(line);
		line=sc.nextLine();
	}
	pw.flush();
	pw.close();
}
}
