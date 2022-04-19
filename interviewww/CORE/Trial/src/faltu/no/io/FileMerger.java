package faltu.no.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerger {
public static void main(String[] args) throws IOException {
	

	FileWriter fw=new FileWriter("C:/Users/Lenovo/Desktop/trial.txt");
	PrintWriter pw=new PrintWriter(fw);
	
	FileReader fr1=new FileReader("C:/Users/Lenovo/Desktop/trial1.txt");
	BufferedReader br1=new BufferedReader(fr1);
	
	FileReader fr2=new FileReader("C:/Users/Lenovo/Desktop/trial2.txt");
	BufferedReader br2=new BufferedReader(fr2);
	
	String line1=br1.readLine();
	String line2=br2.readLine();
	
	while(line1!=null) {
		pw.println(line1);
		line1=br1.readLine();
	}
	while(line2!=null) {
		pw.println(line2);
		line2=br2.readLine();
	}
	
	pw.close();
	br1.close();
	br2.close();
}	
}
