 package in.co.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Merge {
	public static void main(String[] args) throws IOException {
		for(int i=1;i<=3;i++){
			BufferedReader read=new BufferedReader(new FileReader("C:/Users/Aman/Desktop/asr"+i+".txt"));
			BufferedWriter write=new BufferedWriter(new FileWriter("C:/Users/Aman/Desktop/asp1.txt",true));
			String line=read.readLine();
			while(line!=null){
				write.write(line);
				line=read.readLine();
			}
		write.close();
		read.close();
			
		}
		
		System.out.println("done");
	}

}
