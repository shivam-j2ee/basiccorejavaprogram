package in.co.rays.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSplitter {
public static void main(String[] args) throws IOException {
	File f=new File("F:/iO_FILES/splil.txt");
	long size=f.length();
	long split1=size/4;
	long split2=size%4;
	
	byte[] b=new byte[(int)split1];
	BufferedInputStream in=new BufferedInputStream(new FileInputStream(f));
	
	int j=0;
	while(j<4){
		in.read(b); 
		BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream("F:/iO_FILES/splil"+j+".txt"));
		out.write(b);
		out.close();
		j++;
	}
	if(split2>0 && split2<split1){
		BufferedOutputStream out2=new BufferedOutputStream(new FileOutputStream("F:/iO_FILES/split4.txt"));
		byte[] b1=new byte[(int)split2];
		int ch=in.read(b1);
		if(ch!=-1){
			out2.write(b1);
			out2.close();
		}
	}
	in.close();
}
}
