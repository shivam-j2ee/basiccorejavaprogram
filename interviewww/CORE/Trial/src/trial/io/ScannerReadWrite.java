package trial.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerReadWrite {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw=new PrintWriter("C:/Users/Lenovo/Desktop/trial.txt");
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		while(!s.equals("exit")) {
			pw.println(s);
			s=sc.nextLine();
		}
		sc.close();
		pw.close();
	}
}
