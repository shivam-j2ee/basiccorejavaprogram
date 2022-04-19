package trial.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWritePrimitiveData {
public static void main(String[] args) throws IOException {
	
	FileOutputStream fo=new FileOutputStream("I:/FileIO/Primitivedata.txt");
	DataOutputStream d=new DataOutputStream(fo);
	d.writeInt(1);
	d.writeDouble(55.1);
	d.writeChar('v');
	d.flush();
	d.close();
	
	FileInputStream fi=new FileInputStream("I:/FileIO/Primitivedata.txt");
	DataInputStream di=new DataInputStream(fi);
	System.out.println(di.readInt());
	System.out.println(di.readDouble());
	System.out.println(di.readChar());
	di.close();
}
}
