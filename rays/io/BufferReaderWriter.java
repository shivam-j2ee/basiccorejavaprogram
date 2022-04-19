package in.co.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderWriter {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("F:/iO_FILES/JavaByte.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("This is programm of Buffer  ");
        bw.flush();
        bw.close();
        
        FileReader file = new FileReader("F:/iO_FILES/JavaByte.txt");
        BufferedReader br = new BufferedReader(file); 
        
        String s = br.readLine();
        
        while(s !=null){
        	System.out.println(s);
        	s=br.readLine();
        }
        br.close();
	}
}
