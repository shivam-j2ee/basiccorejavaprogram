package com.raystech.core.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveRW {
public static void main(String[] args) throws IOException {
	 FileOutputStream fos=new FileOutputStream("F:/IOExample/abc1.txt");
	 DataOutputStream dos=new DataOutputStream(fos);
	 dos.writeInt(55);
	 dos.writeShort(1);
	 dos.writeDouble(23.45);
	 dos.writeBoolean(true);
	 System.out.println("Primitive Data Saved");
	 
	 FileInputStream fis =new FileInputStream("F:/IOExample/abc1.txt");
	 DataInputStream dis=new DataInputStream(fis);
	 System.out.println(dis.readBoolean());
	 System.out.println(dis.readInt());
	 System.out.println(dis.readShort());
	 System.out.println(dis.readDouble());
}
}
