package com.raystech.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalizable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		FileOutputStream f = new FileOutputStream("D:/C Data/hukumchand_pal.ser");
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		UseExternalizable u = new UseExternalizable("Hukum Pal",24,54);		
		o.writeObject(u);
		
		FileInputStream f1 = new FileInputStream("D:/C Data/hukumchand_pal.ser");
		ObjectInputStream f2 = new ObjectInputStream(f1);
		
		UseExternalizable u1 = (UseExternalizable) f2.readObject();

		
		  f2.close();
		  f1.close();
	      o.close();
	      
		System.out.println(u1.getName());
		System.out.println(u1.getAge());
		System.out.println(u1.getTemp());
	}

}

