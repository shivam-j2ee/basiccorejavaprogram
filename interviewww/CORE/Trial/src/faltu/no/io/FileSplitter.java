package faltu.no.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSplitter {
public static void splitFile(File f) throws FileNotFoundException, IOException {
	int counter=0;
	int size=1024*1024;
	byte[] buffer=new byte[size];
	String fileName=f.getName();
	
	try(FileInputStream fi=new FileInputStream(f);
			BufferedInputStream bi=new BufferedInputStream(fi);
			){
		int bytesAmount=0;
		while((bytesAmount=bi.read(buffer))>0) {
			System.out.println(fileName);
			
			String filePartName=String.format("%s%d",fileName,counter++);
			System.out.println(filePartName);
			
			File f1=new File(f.getParent(),filePartName);
	try(FileOutputStream out=new FileOutputStream(f1)){
		out.write(buffer, 0,bytesAmount);
	}
			
			
		}
	}
	
	
}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f=new File("C:/Users/Lenovo/Desktop/trial.txt");
		splitFile(f);
}
}
