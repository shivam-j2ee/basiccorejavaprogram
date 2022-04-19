package trial.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCopy {
	//Read from one file and write in another...
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("C:/Users/Lenovo/Desktop/trial1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		FileReader fr=new FileReader("C:/Users/Lenovo/Desktop/trial2.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String line=br.readLine();
		
		while(line!=null) {
			bw.write(line);
			line=br.readLine();
		}
		
		System.out.println("Done");
		br.close();
		fw.close();
		
	}

}
