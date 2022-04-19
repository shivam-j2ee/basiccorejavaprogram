package in.co.rays.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWritePrimitiveData {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("C:/Users/admin/Desktop/primitive.txt");
		DataOutputStream d = new DataOutputStream(fos);
		d.writeInt(10);
	
		d.writeDouble(12.5);
		d.writeChar('c');
		d.writeBoolean(false);
		d.flush();
		d.close();
		System.out.println("Done");

		
		FileInputStream fis = new FileInputStream("C:/Users/admin/Desktop/primitive.txt");
		DataInputStream dis = new DataInputStream(fis);

		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());

		dis.close();
	}
}