package trial.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerRead {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader file=new FileReader("C:/Users/Lenovo/Desktop/trial2.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNext()){
			String line=sc.nextLine();
			System.out.println(line);
		}
}}
