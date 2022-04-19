package faltu.no.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KeyboardReadWrite {
public static void main(String[] args) throws IOException {
	PrintWriter pw=new PrintWriter("C:/Users/Lenovo/Desktop/trial.txt");
	InputStreamReader in=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(in);
	
	String line=br.readLine();
	while(!line.equals("exit")) {
		pw.println(line);
		line=br.readLine();
	}
	pw.close();
}
}
