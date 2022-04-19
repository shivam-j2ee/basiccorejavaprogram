package com.raystech.IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritePrimitiveData {

	public static void main(String[] args) throws IOException {

		DataOutputStream d = new  DataOutputStream(new FileOutputStream("D:/C Data/Test.dat",true));
		
		d.writeInt(78);
		d.writeShort(23);
		d.write(45);
		d.writeBoolean(false);
		d.writeByte(01232);
		d.writeLong(897678);
		d.writeUTF("fhj klkd");
		d.writeDouble(232.43);
		d.writeFloat(232.2F);
		d.writeChar('G');
		d.writeChars("khdjk djkdf");
		
		
		
		d.close();		
		
	}

}
