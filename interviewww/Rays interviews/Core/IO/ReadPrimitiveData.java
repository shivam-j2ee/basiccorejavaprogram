package com.raystech.IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadPrimitiveData {

	public static void main(String[] args) throws IOException {

		DataInputStream d = new DataInputStream(new FileInputStream("D:/C Data/Test.dat"));
		System.out.println(d.read());
		System.out.println(d.readLine());
		System.out.println(d.readInt());
		//System.out.println(d.readUTF());
		System.out.println(d.readLong());
		System.out.println(d.readDouble());
		System.out.println(d.readByte());
		System.out.println(d.readFloat());
		System.out.println(d.readShort());
		System.out.println(d.readBoolean());
		System.out.println(d.readChar());
		//System.out.println(d.readLine());

		d.close();
		
		
	}

}
