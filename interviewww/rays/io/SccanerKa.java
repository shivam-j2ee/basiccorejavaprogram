package in.co.rays.io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SccanerKa {
	public static void main(String[] args) throws IOException {
		FileReader file=new FileReader("C:/Users/admin/Desktop/Scanner.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNext()){
			String line=sc.nextLine();
			System.out.println(line);
		}
	}

}
