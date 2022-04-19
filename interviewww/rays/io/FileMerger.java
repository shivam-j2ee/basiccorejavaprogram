package in.co.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerger {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("G:/WorkSpace/Interview/Documents_IO/textFour.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		FileReader fr1 = new FileReader("G:/WorkSpace/Interview/Documents_IO/textTwo.txt");
		BufferedReader br1 = new BufferedReader(fr1);
		
		FileReader fr2 = new FileReader("G:/WorkSpace/Interview/Documents_IO/textThree.txt");
		BufferedReader br2 = new BufferedReader(fr2);
		
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		
		while(line1 != null) {
			pw.println(line1);
			line1 = br1.readLine();
		}
		
		while(line2 != null) {
			pw.println(line2);
			line2 = br2.readLine();
		}
		
		System.out.println("Merger is complete");
		fr2.close();
		fr1.close();
		fw.close();
		
	}
}

